package com.riwi.prueba_desempeno_spring_boot_multimedia.domain.entities;

import com.riwi.prueba_desempeno_spring_boot_multimedia.utils.enums.MultimediaType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.swing.*;
import java.time.LocalDateTime;

@Entity(name = "multimedia")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MultimediaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Enum
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private MultimediaType type;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String url;
    @Builder.Default
    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();;
    @Column(columnDefinition = "TINYINT", nullable = false)
    private Boolean active;

    // Llave foránea
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lesson_id", referencedColumnName = "id", nullable = false)
    private LessonEntity lessonId;
}
