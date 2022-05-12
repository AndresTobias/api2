package ar.com.yoprogramo.api.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.yoprogramo.api.models.Estudios;
import ar.com.yoprogramo.api.repositories.EstudiosRopository;

@Service
public class EstudiosService {
    @Autowired
    EstudiosRopository estudiosRepository;

    // muestra
    public ArrayList<Estudios> getAllEstudios() {
        return (ArrayList<Estudios>) estudiosRepository.findAll();
    }

    // edita y agrega
    public Estudios saveEstudios(Estudios estudios) {
        return estudiosRepository.save(estudios);
    }

    // al pedo busca por id
    public Optional<Estudios> getEstudiosByID(Long id) {
        return estudiosRepository.findById(id);
    }

    // borra uno por id
    public boolean removeEstudio(Long id) {
        try {
            estudiosRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
