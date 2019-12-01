package com.scheduler.backend.service;

import com.scheduler.backend.model.Person;
import com.scheduler.backend.repository.PersonRepository;

import java.util.List;

public class PersonService {
    private final PersonRepository repository;

    public PersonService() {
        this.repository = new PersonRepository();
    }

    public Person save(Person person) {
        return repository.save(person);
    }

    public Person findById(Long id) {
        return repository.findById(id);
    }

    public void delete(Person person) {
        repository.delete(person);
    }

    public List<Person> findAll() {
        return repository.findAll();
    }
}
