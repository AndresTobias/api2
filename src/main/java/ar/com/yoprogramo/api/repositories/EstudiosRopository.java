package ar.com.yoprogramo.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.yoprogramo.api.models.Estudios;

public interface EstudiosRopository extends JpaRepository<Estudios, Long> {
    
}
