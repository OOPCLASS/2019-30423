package com.scheduler.backend.transformer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.scheduler.backend.model.Person;
import com.scheduler.backend.model.PersonType;

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
		person.setId(resultSet.getLong("id"));
		person.setFirstName(resultSet.getString("first_name"));
		person.setLastName(resultSet.getString("last_name"));
		person.setCalendarId(resultSet.getLong("calendar_id"));
		person.setType(PersonType.valueOf(resultSet.getString("type")));
		return person;
	}

}
