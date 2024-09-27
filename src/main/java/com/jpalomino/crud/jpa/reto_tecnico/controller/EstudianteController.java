package com.jpalomino.crud.jpa.reto_tecnico.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpalomino.crud.jpa.reto_tecnico.entities.Estudiante;
import com.jpalomino.crud.jpa.reto_tecnico.service.EstudianteService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/estudiante")
public class EstudianteController {

    @Autowired
    EstudianteService estudianteService;
    
    @GetMapping
    public List<Estudiante> list(){
        return estudianteService.getEstudiantes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estudiante> getEstudiante(@PathVariable Integer id) {
        Optional<Estudiante> estudiante = estudianteService.findById(id);
        //return estudiante.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
        if (estudiante.isPresent()){
            return new ResponseEntity<Estudiante>(estudiante.get(), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping()
    public ResponseEntity<?> saveEstudiante(@RequestBody Estudiante estudiante) {
        Estudiante save =  estudianteService.saveEstudiante(estudiante);
        return ResponseEntity.ok(save);
    }
    
    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteEstudiante(@PathVariable Integer id) {
        estudianteService.deleteEstudiante(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    



    

}
