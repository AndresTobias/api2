package ar.com.yoprogramo.api.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.yoprogramo.api.models.PersonData;
import ar.com.yoprogramo.api.repositories.PersonDataRepository;

@Service

public class PersonDataService {
    @Autowired
    PersonDataRepository personDataRepository;

public ArrayList<PersonData> getAllPersons() {
    return (ArrayList<PersonData>) personDataRepository.findAll();
}
public PersonData savePerson(PersonData persona){
    return personDataRepository.save(persona);
}



}