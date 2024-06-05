package com.riwi.prueba_desempeno_spring_boot_multimedia.api.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClassRequest {
    @NotBlank(message = "El nombre del curso es requerido")
    private String name;
    @NotBlank(message = "La descripción del curso es requerida")
    private String description;
    @NotBlank(message = "El estado del curso es requerido")
    private Boolean active;

}
