package com.riwi.prueba_desempeno_spring_boot_multimedia.api.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentRequest {
    @NotBlank(message = "El nombre del estudiante es requerido")
    private String name;
    @NotBlank(message = "El email del estudiante es requerido")
    private String email;
    @NotBlank(message = "El estado del estudiante es requerido")
    private Boolean active;
}
