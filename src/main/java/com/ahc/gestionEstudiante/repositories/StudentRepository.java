package com.ahc.gestionEstudiante.repositories;

import com.ahc.gestionEstudiante.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

}
