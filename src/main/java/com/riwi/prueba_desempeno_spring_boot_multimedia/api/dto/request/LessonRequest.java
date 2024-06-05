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
public class LessonRequest {
    @NotBlank(message = "La lección es requerida")
    private String title;
    @NotBlank(message = "El contenido de la lección es requerido")
    private String content;
    @NotBlank(message = "El estado de la lección es requerido")
    private Boolean active;

    @NotBlank(message = "El id de la clase es obligatorio")
    private Long classId;

}
