package com.riwi.prueba_desempeno_spring_boot_multimedia.infraestructure.abstract_services;

import com.riwi.prueba_desempeno_spring_boot_multimedia.api.dto.request.MultimediaRequest;
import com.riwi.prueba_desempeno_spring_boot_multimedia.api.dto.response.MultimediaResponse;

public interface IMultimediaRepository extends CrudService<MultimediaRequest, MultimediaResponse, Long>{

}
