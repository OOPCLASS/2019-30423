package com.scheduler.backend.repository;

import com.scheduler.backend.model.Person;
import com.scheduler.backend.model.PersonType;
import org.junit.jupiter.api.Assertions;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonRepositoryTest {

    @org.junit.jupiter.api.Test
    void save() {
        Person person = new Person(PersonType.Student, "John", "Jane");
        PersonRepository repository = new PersonRepository();
        repository.save(person);

        Person newPerson = repository.findById(5L);
        Assertions.assertEquals(person, newPerson);
        newPerson.setType(PersonType.Teacher);
        repository.save(newPerson);
    }

    @org.junit.jupiter.api.Test
    void findById() {
        PersonRepository repository = new PersonRepository();
        Person person = repository.findById(1L);
        System.out.println(person);
    }

    @org.junit.jupiter.api.Test
    void delete() {
        PersonRepository repository = new PersonRepository();
        Person person = repository.findById(1L);
        repository.delete(person);
    }

    @org.junit.jupiter.api.Test
    void findAll() {
        PersonRepository repository = new PersonRepository();
        List<Person> people = repository.findAll();
        System.out.println(people);
    }
}