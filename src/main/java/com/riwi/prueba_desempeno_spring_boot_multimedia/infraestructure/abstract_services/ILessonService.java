package com.riwi.prueba_desempeno_spring_boot_multimedia.infraestructure.abstract_services;

import com.riwi.prueba_desempeno_spring_boot_multimedia.api.dto.request.LessonRequest;
import com.riwi.prueba_desempeno_spring_boot_multimedia.api.dto.response.LessonResponse;

public interface ILessonService extends CrudService<LessonRequest, LessonResponse, Long> {

}
