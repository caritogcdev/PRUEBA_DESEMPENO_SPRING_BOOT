package com.riwi.prueba_desempeno_spring_boot_multimedia.domain.repositories;

import com.riwi.prueba_desempeno_spring_boot_multimedia.domain.entities.MultimediaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MultimediaRepository extends JpaRepository<MultimediaEntity, Long> {

}
