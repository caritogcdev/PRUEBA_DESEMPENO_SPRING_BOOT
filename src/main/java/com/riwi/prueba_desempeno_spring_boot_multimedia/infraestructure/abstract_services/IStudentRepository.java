package com.riwi.prueba_desempeno_spring_boot_multimedia.infraestructure.abstract_services;

import com.riwi.prueba_desempeno_spring_boot_multimedia.api.dto.request.StudentRequest;
import com.riwi.prueba_desempeno_spring_boot_multimedia.api.dto.response.StudentResponse;

public interface IStudentRepository extends CrudService<StudentRequest, StudentResponse, Long> {

}
