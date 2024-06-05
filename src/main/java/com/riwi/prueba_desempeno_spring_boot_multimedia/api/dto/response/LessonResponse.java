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
public class LessonResponse {
    private Long id;
    private String title;
    private String content;
    private LocalDateTime createdAt;
    private Boolean active;

    private ClassBasicResponse classId;
    private List<MultimediaBasicResponse> multimedia;

}
