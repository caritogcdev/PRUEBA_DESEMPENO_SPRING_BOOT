package com.riwi.prueba_desempeno_spring_boot_multimedia.api.controllers;

import com.riwi.prueba_desempeno_spring_boot_multimedia.api.dto.request.ClassRequest;
import com.riwi.prueba_desempeno_spring_boot_multimedia.api.dto.response.ClassResponse;
import com.riwi.prueba_desempeno_spring_boot_multimedia.infraestructure.abstract_services.IClassService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/class")
@AllArgsConstructor
// Con Tag podemos cambiar el nombre en swagger
@Tag(name = "Class")
public class ClassController {

    @Autowired
    private final IClassService iClassService;

    @Operation(summary = "Lista todas las clases con paginación", description = "Debes enviar la pagina y el tamaño de la pagina para recibir todas las clases correspondientes")
    @GetMapping
    public ResponseEntity<Page<ClassResponse>> getAll(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "5") int size){

        return ResponseEntity.ok(this.iClassService.getAll(page - 1, size));
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<ClassResponse> get(
            @PathVariable Long id
    ) {
        return ResponseEntity.ok(this.iClassService.get(id));
    }

    @PostMapping
    public ResponseEntity<ClassResponse> create(
            @Validated @RequestBody ClassRequest classRequest
            ){
        return ResponseEntity.ok(this.iClassService.create(classRequest));
    }

}
