package ar.com.yoprogramo.api.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.yoprogramo.api.models.Person;

public interface PersonRepository extends JpaRepository<Person,Long> {
    public abstract ArrayList<Person>findByApellido(String apellido);    
}
