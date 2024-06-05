package com.riwi.prueba_desempeno_spring_boot_multimedia.infraestructure.abstract_services;

import com.riwi.prueba_desempeno_spring_boot_multimedia.api.dto.request.ClassRequest;
import com.riwi.prueba_desempeno_spring_boot_multimedia.api.dto.response.ClassResponse;

public interface IClassService extends CrudService<ClassRequest, ClassResponse, Long>{

}
