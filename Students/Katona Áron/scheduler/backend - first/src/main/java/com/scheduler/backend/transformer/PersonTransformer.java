package com.scheduler.backend.transformer;

import com.scheduler.backend.model.Person;
import com.scheduler.backend.model.PersonType;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonTransformer implements Transformer<Person> {

    @Override
    public Person toModel(ResultSet resultSet) {
        try {
            if (resultSet.next()) {
                return buildPerson(resultSet);
            }
        } catch (SQLException e) {
            // something went wrong here..
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Person> toModelList(ResultSet resultSet) {
        List<Person> persons = new ArrayList<>();
        try {
            while (resultSet.next()) {
                Person person = buildPerson(resultSet);
                if (person != null) {
                    persons.add(person);
                }
            }
        } catch (SQLException e) {
            // something went wrong here..
            e.printStackTrace();
        }
        return persons;
    }

    private Person buildPerson(ResultSet resultSet) throws SQLException {
        Person person = new Person();
        person.setId(TransformerUtil.getLong(resultSet, "id"));
        person.setFirstName(TransformerUtil.getString(resultSet, "first_name"));
        person.setLastName(TransformerUtil.getString(resultSet, "last_name"));
        person.setCalendarId(TransformerUtil.getLong(resultSet, "calendar_id"));
        person.setType(PersonType.valueOf(TransformerUtil.getString(resultSet, "type")));
        return person;
    }

}
