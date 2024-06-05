package com.riwi.prueba_desempeno_spring_boot_multimedia.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClassResponse {
    private Long id;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private Boolean active;

    private List<LessonBasicResponse> lessons;
    private List<StudentBasicResponse> students;

}
