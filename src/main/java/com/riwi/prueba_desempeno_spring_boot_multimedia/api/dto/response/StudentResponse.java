package com.riwi.prueba_desempeno_spring_boot_multimedia.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentResponse {
    private Long id;
    private String name;
    private String email;
    private LocalDateTime createdAt;
    private Boolean active;

    private ClassBasicResponse classId;
}
