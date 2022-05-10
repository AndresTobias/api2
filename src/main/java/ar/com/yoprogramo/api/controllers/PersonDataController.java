package ar.com.yoprogramo.api.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.yoprogramo.api.models.PersonData;
import ar.com.yoprogramo.api.services.PersonDataService;

@RestController
@RequestMapping("/api/personData")

public class PersonDataController {
    @Autowired
    PersonDataService personDataService;

    @GetMapping("/all")
    public ArrayList<PersonData> getAllPersons() {
        return personDataService.getAllPersons();
    }

    @PostMapping()
    public PersonData savePerson(@RequestBody PersonData person) {
        return personDataService.savePerson(person);
    }
}
