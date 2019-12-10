package com.scheduler.backend.service;

import com.scheduler.backend.model.Person;
import com.scheduler.backend.repository.PersonRepository;

import java.util.List;

public class PersonService implements Service<Person> {

    private PersonRepository personRepository;

    public PersonService() {
        this.personRepository = new PersonRepository();
    }

    @Override
    public Person save(Person entity) {
        return personRepository.save(entity);
    }

    @Override
    public Person findById(Long id) {
        return personRepository.findById(id);
    }

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public boolean delete(Person entity) {
        return personRepository.delete(entity);
    }
}
