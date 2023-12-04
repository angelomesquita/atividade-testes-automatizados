package com.example.junitpoccarlosbrenzan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/addPerson")
    public String addPerson(@RequestParam String name, @RequestParam int age) {
        personService.insertPerson(name, age);
        return "Pessoa adicionada com sucesso!";
    }
}
