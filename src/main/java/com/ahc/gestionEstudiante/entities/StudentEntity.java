package com.ahc.gestionEstudiante.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="student")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class StudentEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idStudente;

    private String name;
    private String email;
    private Integer age;

}
