package ar.com.yoprogramo.api.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.yoprogramo.api.models.Trabajos;
import ar.com.yoprogramo.api.services.TrabajosService;

@RestController
@RequestMapping("/api/trabajos")
public class TrabajosController {
    @Autowired
    TrabajosService trabajosService;

    // para mostrar todo lo de la lista
    @GetMapping("/all")
    public ArrayList<Trabajos> getAllTrabajos() {
        return trabajosService.getAllTrabajos();
    }

    // para agregar o modificar
    @PostMapping()
    public Trabajos savetTrabajos(@RequestBody Trabajos trabajo) {
        return trabajosService.saveTrabajos(trabajo);
    }
    
    //para borrar
    @DeleteMapping("/{id}")
    public boolean removeTrabajo(@PathVariable("id") Long id) {
        return (trabajosService.removeTrabajo(id));
    }
}
