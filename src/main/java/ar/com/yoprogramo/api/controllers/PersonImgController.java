package ar.com.yoprogramo.api.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.yoprogramo.api.models.PersonImg;
import ar.com.yoprogramo.api.services.PersonImgService;

@RestController
@RequestMapping("/api/personImg")
public class PersonImgController {
    @Autowired
    PersonImgService personImgService;
    
    @GetMapping("/all")
    public ArrayList<PersonImg> getAllPersonsImg() {
        return personImgService.getAllPersonsImg();
    }

    @PostMapping()
    public PersonImg savePersonImg(@RequestBody PersonImg personImg) {
        return personImgService.savePersonImg(personImg);
    }

    @GetMapping("/{id}")
    public Optional<PersonImg> getPersonImgByID(@PathVariable("id")long id){
        return personImgService.getPersonImgByID(id);
    }
}
