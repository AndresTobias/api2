package ar.com.yoprogramo.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.yoprogramo.api.models.Trabajos;

public interface TrabajosRepository extends JpaRepository<Trabajos, Long>{
    
}
