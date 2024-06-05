package com.riwi.prueba_desempeno_spring_boot_multimedia.utils.exceptions;

public class BadRequestException extends RuntimeException{

    public BadRequestException(String message) {
        super(message);
    }
}
