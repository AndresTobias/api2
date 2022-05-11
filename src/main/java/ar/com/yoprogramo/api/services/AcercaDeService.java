package ar.com.yoprogramo.api.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.yoprogramo.api.models.AcercaDe;
import ar.com.yoprogramo.api.repositories.AcercaDeRepository;

@Service
public class AcercaDeService {
    @Autowired
    AcercaDeRepository acercaDeRepository; 

    public ArrayList<AcercaDe> getAllAcercaDe() {
        return (ArrayList<AcercaDe>) acercaDeRepository.findAll();
    }
    public AcercaDe saveAcercaDe(AcercaDe datos){
        return acercaDeRepository.save(datos);
    }
    public Optional<AcercaDe> getAcercaDeByID(long id) {
        return acercaDeRepository.findById(id);
    }
    

    
}
