package com.example.junitpoccarlosbrenzan;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@Transactional
public class PersonServiceTest {

    @Autowired
    private PersonService personService;

    @Autowired
    private PersonRepository personRepository;

    @Test
    public void testInsertPerson() {
        //insere a pessoa no h2
        personService.insertPerson("Carlos Brenzan", 28);

        //pesquisa a pessoa recém inserida e verifica se está presente no banco de dados.
        //Este método pode ser estendido para validações de status padronizados, e também de flags esperadas no cadastro de produtos/serviços
        Optional<Person> savedPerson = personRepository.findByName("Carlos Brenzan");
        assertTrue(savedPerson.isPresent(), "Pessoa salva não foi encontrada");
        assertEquals("Carlos Brenzan", savedPerson.get().getName(), "O nome deve ser igual ao que está salvo.");
        assertEquals(28, savedPerson.get().getAge(), "A idade deve ser igual à que está salva.");
    }
}