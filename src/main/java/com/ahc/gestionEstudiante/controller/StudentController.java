package com.ahc.gestionEstudiante.controller;

import com.ahc.gestionEstudiante.dto.StudentDTO;
import com.ahc.gestionEstudiante.entities.StudentEntity;
import com.ahc.gestionEstudiante.service.implservice.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
@AllArgsConstructor

public class StudentController {

    //inyection dependency
    private final StudentService studentService;

    @PostMapping
    public StudentEntity createStudent(@RequestBody StudentEntity student) {
        return studentService.createStudent(student);
    }

    @GetMapping
    public List<StudentDTO> getStudentDTOs() {
        return studentService.getStudentDTOs();
    }

    @GetMapping("/{id}")
    public StudentDTO getStudentById(@PathVariable Long id) {
        return studentService.findStudentById(id);
    }



}
