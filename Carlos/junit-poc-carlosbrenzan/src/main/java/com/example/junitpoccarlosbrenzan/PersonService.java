package com.example.junitpoccarlosbrenzan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public void insertPerson(String name, int age) {
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        personRepository.save(person);
    }

    public Optional<Person> findPersonByName(String name) {
        return personRepository.findByName(name);
    }
}
