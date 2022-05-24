package ar.com.yoprogramo.api.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.yoprogramo.api.models.Tortas;
import ar.com.yoprogramo.api.services.TortasService;

@RestController
@RequestMapping("/api/tortas")
public class TortasController {
    @Autowired
    TortasService tortasService;
     
    
         // para mostrar todo lo de la lista
    @GetMapping("/all")
    public ArrayList<Tortas> getAllTortas() {
        return tortasService.getAllTortas();
    }

    // para agregar o modificar
    @PostMapping()
    public Tortas saveTortas(@RequestBody Tortas torta) {
        return tortasService.saveTortas(torta);
    }

    
}
