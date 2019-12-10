package com.scheduler.backend.service;

import java.util.List;

import com.scheduler.backend.model.Person;
import com.scheduler.backend.repository.PersonRepository;

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
		// call findById on repository
		return null;
	}

	@Override
	public List<Person> findAll() {
		// call findAll on repository
		return personRepository.findAll();
	}

	@Override
	public boolean delete(Person entity) {
		// call delete on repository
		return false;
	}
}
