package com.ahc.gestionEstudiante.service.implservice;

import com.ahc.gestionEstudiante.dto.StudentDTO;
import com.ahc.gestionEstudiante.entities.StudentEntity;
import com.ahc.gestionEstudiante.repositories.StudentRepository;
import com.ahc.gestionEstudiante.service.Iservice.IStudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor

public class StudentService implements IStudentService {

    //inyection dependecy
    private final StudentRepository studentRepository;

    @Override
    public StudentEntity createStudent(StudentEntity student) {
        return studentRepository.save(student);
    }

    @Override
    public StudentDTO findStudentById(Long id) {
        return studentRepository.findById(id)
                .map(s-> new StudentDTO(s.getName(),s.getEmail()))
                .orElse(null);
    }


    @Override
    public List<StudentDTO> getStudentDTOs() {
       return studentRepository.findAll()
               .stream()
               .map(r->new StudentDTO(r.getName(),r.getEmail()))
               .collect(Collectors.toList());
    }

}
