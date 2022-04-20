package ar.com.yoprogramo.api.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.yoprogramo.api.models.Person;
import ar.com.yoprogramo.api.repositories.PersonRepository;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;

    public ArrayList<Person> getAllPersons() {
        return (ArrayList<Person>) personRepository.findAll();
    }
    public Person savePerson(Person persona){
        return personRepository.save(persona);
    }
    public Optional<Person> getPersonByID(long id) {
        return personRepository.findById(id);
    }
    public ArrayList<Person> getPersonByApellido(String apellido) {
        return personRepository.findByApellido(apellido);
    }
    public boolean removePerson(Long id) {
        try{
            personRepository.deleteById(id);
        return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
}
