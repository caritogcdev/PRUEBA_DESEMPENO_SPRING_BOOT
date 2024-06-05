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
public class MultimediaRequest {
    @NotBlank(message = "El tipo de archivo multimedia es requerido")
    private String type;
    @NotBlank(message = "La url del archivo es requerida")
    private String url;
    @NotBlank(message = "El estado del archivo multimedia es requerido")
    private Boolean active;
}
