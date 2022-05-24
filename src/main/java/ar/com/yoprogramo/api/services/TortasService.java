package ar.com.yoprogramo.api.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.yoprogramo.api.models.Tortas;
import ar.com.yoprogramo.api.repositories.TortasRepository;

@Service

public class TortasService {
    @Autowired
    TortasRepository tortasRepository;
    
    // muestra
    public ArrayList<Tortas> getAllTortas() {
        return (ArrayList<Tortas>) tortasRepository.findAll();
    }
    // edita y agrega
    public Tortas saveTortas(Tortas torta) {
        return tortasRepository.save(torta);
    }
    
    
    //public Tortas save(Tortas torta) {
      //  return tortasRepository.save(torta);
    //}

}
