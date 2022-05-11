package ar.com.yoprogramo.api.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.yoprogramo.api.models.AcercaDe;
import ar.com.yoprogramo.api.services.AcercaDeService;

@RestController
@RequestMapping("/api/acercaDe")

public class AcercaDeController {
    @Autowired
    AcercaDeService acercaDeService;

    @GetMapping("/all")
    public ArrayList<AcercaDe> getAllAcercaDe() {
        return acercaDeService.getAllAcercaDe();
    }

    @PostMapping()
    public AcercaDe saveAcercaDe(@RequestBody AcercaDe datos) {
        return acercaDeService.saveAcercaDe(datos);
    }

    @GetMapping("/{id}")
    public Optional<AcercaDe> getAcercaDeByID(@PathVariable("id")long id){
        return acercaDeService.getAcercaDeByID(id);
    }


    
}
