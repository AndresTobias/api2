package ar.com.yoprogramo.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.yoprogramo.api.models.Tortas;

public interface TortasRepository extends JpaRepository<Tortas, Long> {
    
}