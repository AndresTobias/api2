package ar.com.yoprogramo.api.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.yoprogramo.api.models.PersonImg;
import ar.com.yoprogramo.api.repositories.PersonImgRepository;

@Service
public class PersonImgService {
    @Autowired
    PersonImgRepository personImgRepository;

    public ArrayList<PersonImg> getAllPersonsImg() {
        return (ArrayList<PersonImg>) personImgRepository.findAll();
    }
    public PersonImg savePersonImg(PersonImg personaImg){
        return personImgRepository.save(personaImg);
    }
    public Optional<PersonImg> getPersonImgByID(long id) {
        return personImgRepository.findById(id);
    }
    //public ArrayList<PersonImg> getPersonByImagen(String imagen) {
    //    return personImgRepository.findByImagen(imagen);
    //}
    //public boolean removePerson(Long id) {
    //    try{
    //        personRepository.deleteById(id);
    //    return true;
    //    }
    //    catch(Exception e){
    //        return false;
    //    }
    //}
    
}
