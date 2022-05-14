package ar.com.yoprogramo.api.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.yoprogramo.api.models.Trabajos;
import ar.com.yoprogramo.api.repositories.TrabajosRepository;

@Service
public class TrabajosService {
    @Autowired
    TrabajosRepository trabajosRepository;

    // muestra
    public ArrayList<Trabajos> getAllTrabajos() {
        return (ArrayList<Trabajos>) trabajosRepository.findAll();
    }

    // edita y agrega
    public Trabajos saveTrabajos(Trabajos trabajo) {
        return trabajosRepository.save(trabajo);
    }

    // borra uno por id
    public boolean removeTrabajo(Long id) {
        try {
            trabajosRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
