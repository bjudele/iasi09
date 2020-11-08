package com.sda.iasi09.controller;

import com.sda.iasi09.model.Person;
import com.sda.iasi09.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class RestApiController {

    private PersonService personService;

    @Autowired
    public RestApiController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/abcd")
    public ResponseEntity<Person> abcd() {
        Person person = personService.findRandomPerson();
        return new ResponseEntity<>(person, HttpStatus.OK);
    }

    @GetMapping("/abcde")
    public ResponseEntity<List<Person>> listAbcd(){
        List<Person> people = Arrays.asList(new Person(), new Person());
        return new ResponseEntity<>(people, HttpStatus.OK);
    }
}
