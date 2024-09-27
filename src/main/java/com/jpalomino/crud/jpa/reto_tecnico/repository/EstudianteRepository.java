package com.jpalomino.crud.jpa.reto_tecnico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpalomino.crud.jpa.reto_tecnico.entities.Estudiante;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante,Integer> {

}
