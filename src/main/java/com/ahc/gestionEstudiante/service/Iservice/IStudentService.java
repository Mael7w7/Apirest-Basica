package com.ahc.gestionEstudiante.service.Iservice;

import com.ahc.gestionEstudiante.dto.StudentDTO;
import com.ahc.gestionEstudiante.entities.StudentEntity;

import java.util.List;

public interface IStudentService {
    StudentEntity createStudent(StudentEntity student);
    StudentDTO findStudentById(Long id);
    List<StudentDTO>  getStudentDTOs();
}
