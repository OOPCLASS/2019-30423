package com.scheduler.backend.repository;

import com.scheduler.backend.model.Person;
import com.scheduler.backend.model.PersonType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class PersonRepositoryTest {

    private DBConnector dbConnector = DBConnector.getInstance();
    private PersonRepository personRepository = new PersonRepository();

    private List<Person> people = List.of(
            new Person("John", "Smith", PersonType.STUDENT),
            new Person("Maria", "Garcia", PersonType.TEACHER),
            new Person("David", "Hernandez", PersonType.STUDENT, 3L),
            new Person("Juan", "Carlos", PersonType.TEACHER, 4L)
    );

    @BeforeEach
    void setUp() {
        dbConnector.executeUpdate("SET FOREIGN_KEY_CHECKS = 0;");
        dbConnector.executeUpdate("TRUNCATE TABLE person;");
        dbConnector.executeUpdate("ALTER TABLE person AUTO_INCREMENT = 1;");


        dbConnector.executeUpdate("TRUNCATE TABLE calendar;");
        dbConnector.executeUpdate("ALTER TABLE calendar AUTO_INCREMENT = 1;");
        for (int i = 0; i < people.size(); i++) {
            dbConnector.executeUpdate("INSERT INTO calendar() VALUES();");
            dbConnector.executeUpdate("INSERT INTO calendar() VALUES();");
        }
        dbConnector.executeUpdate("SET FOREIGN_KEY_CHECKS = 1;");
    }

    @Test
    void saveOne() {
        Person person = people.get(0);

        Person savedPerson = personRepository.save(person);
        Assertions.assertEquals(person, savedPerson);
        Assertions.assertEquals(1, savedPerson.getId());

        Person foundPerson = personRepository.findById(savedPerson.getId());
        Assertions.assertEquals(savedPerson, foundPerson);
    }

    @Test
    void saveMany() {
        for (int i = 0; i < people.size(); i++) {
            Person person = people.get(i);

            Person savedPerson = personRepository.save(person);
            Assertions.assertEquals(person, savedPerson);
            Assertions.assertEquals(i + 1, savedPerson.getId());

            Person foundPerson = personRepository.findById(savedPerson.getId());
            Assertions.assertEquals(savedPerson, foundPerson);
        }
    }

    @Test
    void updateMany() {
        saveMany();
        List<Person> people1 = new ArrayList<>(personRepository.findAll());
        for (Person person : people1) {
            person.setFirstName(person.getFirstName() + "-updated");
            person.setLastName(person.getLastName() + "-updated");
            person.setType(person.getType() == PersonType.STUDENT ? PersonType.TEACHER : PersonType.STUDENT);
            person.setCalendarId(person.getCalendarId() == null ? person.getId() : null);
            Assertions.assertEquals(person, personRepository.save(person));
        }
        Assertions.assertEquals(people1, personRepository.findAll());
    }

    @Test
    void findById() {
        for (Person person : people) {
            personRepository.save(person);
        }
        for (int i = 0; i < people.size(); i++) {
            Assertions.assertEquals(people.get(i), personRepository.findById((long) i + 1));
        }
    }

    @Test
    void findByInvalidId() {
        Assertions.assertNull(personRepository.findById(11L));
        Assertions.assertNull(personRepository.findById(null));
    }

    @Test
    void findAll() {
        for (Person person : people) {
            personRepository.save(person);
        }
        List<Person> result = personRepository.findAll();
        Assertions.assertEquals(people, result);
        for (int i = 0; i < people.size(); i++) {
            int index = people.indexOf(result.get(i));
            Assertions.assertEquals(index + 1, result.get(i).getId());
        }
    }

    @Test
    void deleteMany() {
        for (Person person : people) {
            personRepository.save(person);
        }

        List<Person> people2 = new ArrayList<>(personRepository.findAll());
        final int[] indicesToDelete = {1, 0, 1, 0};
        for (int index : indicesToDelete) {
            Assertions.assertTrue(personRepository.delete(people2.get(index)));
            people2.remove(index);
            Assertions.assertEquals(people2, personRepository.findAll());
        }
    }

    @Test
    void DeleteEmptyAndNewPerson() {
        Assertions.assertFalse(personRepository.delete(null));
        Assertions.assertFalse(personRepository.delete(new Person()));
    }

    @Test
    void DeleteInvalidKey() {
        Person person = new Person();
        person.setId(22L);
        Assertions.assertTrue(personRepository.delete(person));
    }

}
