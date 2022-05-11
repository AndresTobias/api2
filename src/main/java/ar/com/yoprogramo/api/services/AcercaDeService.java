package ar.com.yoprogramo.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.yoprogramo.api.repositories.AcercaDeRepository;

@Service
public class AcercaDeService {
    @Autowired
    AcercaDeRepository acercaDeRepository;

    
}
