package com.riwi.prueba_desempeno_spring_boot_multimedia.domain.repositories;

import com.riwi.prueba_desempeno_spring_boot_multimedia.domain.entities.ClassEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepository extends JpaRepository<ClassEntity, Long> {

}
