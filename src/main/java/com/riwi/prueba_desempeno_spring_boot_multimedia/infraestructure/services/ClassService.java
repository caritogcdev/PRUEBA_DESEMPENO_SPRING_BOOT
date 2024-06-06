package com.riwi.prueba_desempeno_spring_boot_multimedia.infraestructure.services;

import com.riwi.prueba_desempeno_spring_boot_multimedia.api.dto.request.ClassRequest;
import com.riwi.prueba_desempeno_spring_boot_multimedia.api.dto.response.ClassResponse;
import com.riwi.prueba_desempeno_spring_boot_multimedia.api.dto.response.LessonBasicResponse;
import com.riwi.prueba_desempeno_spring_boot_multimedia.api.dto.response.MultimediaResponse;
import com.riwi.prueba_desempeno_spring_boot_multimedia.api.dto.response.StudentResponse;
import com.riwi.prueba_desempeno_spring_boot_multimedia.domain.entities.ClassEntity;
import com.riwi.prueba_desempeno_spring_boot_multimedia.domain.entities.LessonEntity;
import com.riwi.prueba_desempeno_spring_boot_multimedia.domain.repositories.ClassRepository;
import com.riwi.prueba_desempeno_spring_boot_multimedia.infraestructure.abstract_services.IClassService;
import com.riwi.prueba_desempeno_spring_boot_multimedia.utils.exceptions.BadRequestException;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class ClassService implements IClassService {

    @Autowired
    private final ClassRepository classRepository;

    @Override
    public ClassResponse create(ClassRequest request) {
        ClassEntity classEntity = this.requestToEntity(request);
        classEntity.setLessons(new ArrayList<>());
        return this.entityToResponse(this.classRepository.save(classEntity));
    }

    @Override
    public ClassResponse get(Long id) {
        return this.entityToResponse(this.find(id));
    }

    @Override
    public ClassResponse update(ClassRequest request, Long id) {
        ClassEntity classEntity = this.find(id);

        ClassEntity classEntityUpdate = this.requestToEntity(request);
        classEntityUpdate.setId(id);
        classEntityUpdate.setLessons(classEntity.getLessons());

        return this.entityToResponse(this.classRepository.save(classEntityUpdate));
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Page<ClassResponse> getAll(int page, int size) {

        if (page <0) page = 0;

        PageRequest pagination = PageRequest.of(page, size);

        return this.classRepository.findAll(pagination)
                .map(this::entityToResponse);
    }

    /** Métodos no sobreescritos */

    // Convertir de entidad a response
    private ClassResponse entityToResponse (ClassEntity entity){

        List<LessonBasicResponse> lessons = entity.getLessons()
                .stream()
                .map(this::entityToResponseLesson)
                .collect(Collectors.toList());

        return ClassResponse.builder()
                .id(entity.getId())
                .name(entity.getName())
                .description(entity.getDescription())
                .createdAt(entity.getCreatedAt())
                .active(entity.getActive())
                .lessons(lessons)
                .build();
    }

    // Convertir de entidad a response lesson
    private LessonBasicResponse entityToResponseLesson(LessonEntity entity){

        MultimediaResponse multimediaResponse = new MultimediaResponse();
        BeanUtils.copyProperties(entity.getMultimedia(), multimediaResponse);

        return LessonBasicResponse.builder()
                .id(entity.getId())
                .title(entity.getTitle())
                .content(entity.getContent())
                .createdAt(entity.getCreatedAt())
                .active(entity.getActive())
                .build();
    }

    // Convertir de request a Entity
    private ClassEntity requestToEntity(ClassRequest classRequest){
        return ClassEntity.builder()
                .name(classRequest.getName())
                .description(classRequest.getDescription())
                .active(classRequest.getActive())
                .build();
    }

    // Para obtener clase por id
    private ClassEntity find(Long id){
        return this.classRepository.findById(id)
                .orElseThrow(()-> new BadRequestException("No hay clases con el id digitado"));
    }


}
