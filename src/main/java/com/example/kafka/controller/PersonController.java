package com.example.kafka.controller;

import com.example.kafka.model.Person;
import com.example.kafka.service.producer.ProducerPersonServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1.0/persons")
public class PersonController {

    private final ProducerPersonServiceImpl personService;

    public PersonController(ProducerPersonServiceImpl personService) {
        this.personService = personService;
    }

    @PostMapping("/publish")
    public ResponseEntity<Person> sendPersonToKafkaTopic(@RequestBody Person person) {
        personService.sendPerson(person);
        return ResponseEntity.status(200).body(person);
    }

}
