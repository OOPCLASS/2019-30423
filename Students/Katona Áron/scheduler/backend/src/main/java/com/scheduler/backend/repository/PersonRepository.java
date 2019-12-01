package com.scheduler.backend.repository;

import com.scheduler.backend.model.Person;
import com.scheduler.backend.model.PersonType;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonRepository implements Repository<Person, Long> {

    public Person save(Person person) {
        if (person.getId() == -1) {
            db.executeUpdate("INSERT INTO person (first_name, last_name, type) VALUES ("
                    + "'" + person.getFirstName() + "',"
                    + "'" + person.getLastName() + "',"
                    + "'" + person.getType() + "');"
            );
        } else {
            db.executeUpdate("UPDATE person SET "
                    + "first_name = '" + person.getFirstName() + "', "
                    + "last_name = '" + person.getLastName() + "', "
                    + "type = '" + person.getType() + "' "
                    + "WHERE id = " + person.getId() + ";"
            );
        }
        return person;
    }

    public Person findById(Long id) {
        ResultSet resultSet = db.executeQuery("SELECT * FROM person WHERE id = " + id);
        try {
            if (resultSet.next()) {
                Person person = new Person(
                        PersonType.valueOf(resultSet.getString("type")),
                        resultSet.getString("first_name"),
                        resultSet.getString("last_name")
                );
                person.setId(resultSet.getLong("id"));
                return person;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void delete(Person person) {
        if (person.getId() != -1) {
            db.executeUpdate("DELETE FROM person WHERE id = " + person.getId() + ";");
        }
    }

    public List<Person> findAll() {
        ResultSet resultSet = db.executeQuery("SELECT * FROM person");
        List<Person> result = new ArrayList<>();
        try {
            while (resultSet.next()) {
                Person person = new Person(
                        PersonType.valueOf(resultSet.getString("type")),
                        resultSet.getString("first_name"),
                        resultSet.getString("last_name")
                );
                person.setId(resultSet.getLong("id"));
                result.add(person);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
