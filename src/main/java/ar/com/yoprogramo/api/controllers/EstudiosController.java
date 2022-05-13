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

import ar.com.yoprogramo.api.models.Estudios;
import ar.com.yoprogramo.api.services.EstudiosService;

@RestController
@RequestMapping("/api/estudios")
public class EstudiosController {
    @Autowired
    EstudiosService estudiosService;

    // para mostrar todo lo de la lista
    @GetMapping("/all")
    public ArrayList<Estudios> getAllEstudios() {
        return estudiosService.getAllEstudios();
    }

    // para agregar o modificar
    @PostMapping()
    public Estudios saveEstudio(@RequestBody Estudios person) {
        return estudiosService.saveEstudios(person);
    }

    // para borrar este es el original
   /* @DeleteMapping("/{id}")
    public String removePerson(@PathVariable("id") Long id) {
        if (estudiosService.removeEstudio(id)) {
           return "se elimino " + id + "ok";
        } else {
            return "no se borro";
        }
    }*/
    @DeleteMapping("/{id}")
    public boolean removePerson(@PathVariable("id") Long id) {
        return (estudiosService.removeEstudio(id));
    }

}
