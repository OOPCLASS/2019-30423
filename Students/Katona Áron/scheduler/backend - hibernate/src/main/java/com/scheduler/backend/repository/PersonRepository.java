package com.scheduler.backend.repository;

import com.scheduler.backend.model.Person;
import com.scheduler.backend.service.HibernateService;
import org.hibernate.Session;

import java.util.List;

public class PersonRepository implements Repository<Person> {

    public Person save(Person entity) {
        Session databaseSession = HibernateService.getSessionFactory().openSession();
        databaseSession.beginTransaction();
        databaseSession.saveOrUpdate(entity);
        databaseSession.getTransaction().commit();
        return entity;
    }

    public Person findById(Long id) {
        // create the select query
        // execute it
        // transform ResultSet to Person and return it
        return null;
    }

    public List<Person> findAll() {
        Session databaseSession = HibernateService.getSessionFactory().openSession();
        List<Person> result = databaseSession.createCriteria(Person.class).list();
        return result;
    }

    public boolean delete(Person entity) {
        // the above implementations should be helpful for implementing this
        return false;
    }

}
