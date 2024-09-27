package com.jpalomino.crud.jpa.reto_tecnico.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Estudiante")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false ,length = 40)
    private String nombre;
    @Column(nullable = false ,length = 40)
    private String apellido;
    @Column(nullable = false ,length = 40,unique = true)
    private String email;
    @Column(nullable = false)
    private int creditos;
    @Column(nullable = false)
    private int semestre;
    @Column(nullable = false)
    private int promedio;
    
    

}
