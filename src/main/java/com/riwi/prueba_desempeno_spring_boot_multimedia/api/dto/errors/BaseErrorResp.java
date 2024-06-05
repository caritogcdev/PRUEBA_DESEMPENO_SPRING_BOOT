package com.riwi.prueba_desempeno_spring_boot_multimedia.api.dto.errors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

/** Manejo de errores HTTP */
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
/*Serializable clase especial para responder por http (códigos) */
public class BaseErrorResp implements Serializable {
    private String status;
    private Integer code;
}
