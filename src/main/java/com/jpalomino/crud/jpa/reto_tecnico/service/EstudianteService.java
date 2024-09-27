package com.jpalomino.crud.jpa.reto_tecnico.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpalomino.crud.jpa.reto_tecnico.entities.Estudiante;
import com.jpalomino.crud.jpa.reto_tecnico.repository.EstudianteRepository;

@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    public List<Estudiante> getEstudiantes(){
        return estudianteRepository.findAll();
    }

    public Optional<Estudiante> findById(Integer id){
        return estudianteRepository.findById(id);
    }

    public Estudiante saveEstudiante(Estudiante estudiante){
        return estudianteRepository.save(estudiante);
    }

    public void deleteEstudiante(Integer id){
         estudianteRepository.deleteById(id);
    }

    public Estudiante updateEstudiante(Estudiante estudiante){
        return estudianteRepository.save(estudiante);
    }
    

}
