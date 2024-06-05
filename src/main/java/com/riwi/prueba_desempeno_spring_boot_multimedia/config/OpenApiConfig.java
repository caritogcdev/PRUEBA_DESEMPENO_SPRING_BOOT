package com.riwi.prueba_desempeno_spring_boot_multimedia.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

/**
 * Configuración del Swagger
 */
@Configuration
@OpenAPIDefinition(info = @Info(title = "Api para la gestión de contenido multimedia de las clases impartidas en Riwi", version = "1,0", description = "Documentación API de destión de contenido multimedia"))
public class OpenApiConfig {

}
