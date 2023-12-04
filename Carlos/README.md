# Projeto simples para testes unitários

Este projeto é um aplicativo Spring Boot que utiliza Spring Data JPA para a persistência de dados em um banco de dados H2. Ele define uma entidade 'Person', um repositório para operações no banco de dados e uma classe de serviço para lógica de negócios. 
Os testes JUnit foram criados para as classes 'PersonRepository' e 'PersonService' para garantir o correto funcionamento das oeperações de persistência e da lógica de serviço.

Lembrando que esta aplicação serve como exemplo para estender o uso de testes unitários dentro de aplicações complexas, onde a simples criação de uma classe e métodos que testam cenários possibilitam para que a equipe de desenvolvimento melhore na qualidade do código. 


## Installation

1) Clonar o repositório
```bash
https://github.com/carlosbrenzan/atividade-testes-automatizados.git
```
2) Realizar a build do projeto
```bash
mvn clean install
```
3) Rodar a aplicação
```bash
mvn spring-boot:run
```
5) Rodar os testes
```bash
mvn test
```



