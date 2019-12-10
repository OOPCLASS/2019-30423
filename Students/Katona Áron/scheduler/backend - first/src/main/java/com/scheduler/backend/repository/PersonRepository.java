package com.scheduler.backend.repository;

import com.scheduler.backend.model.Person;
import com.scheduler.backend.transformer.LastInsertIdTransformer;
import com.scheduler.backend.transformer.PersonTransformer;

import java.sql.ResultSet;
import java.util.List;

public class PersonRepository implements Repository<Person> {

    private PersonTransformer personTransformer;
    private LastInsertIdTransformer lastInsertIdTransformer;

    public PersonRepository() {
        this.personTransformer = new PersonTransformer();
        this.lastInsertIdTransformer = new LastInsertIdTransformer();
    }

    public Person save(Person entity) {
        if (entity.getId() == null) {
            String insertQuery =
                    String.format("INSERT INTO person (first_name, last_name, type, calendar_id) VALUES('%s','%s','%s',%d);",
                            entity.getFirstName(),
                            entity.getLastName(),
                            entity.getType(),
                            entity.getCalendarId()
                    );
            DBConnector.getInstance().executeUpdate(insertQuery);
            ResultSet resultSet = DBConnector.getInstance().executeQuery("SELECT LAST_INSERT_ID();");
            return findById(lastInsertIdTransformer.toModel(resultSet));
        } else {
            String updateQuery =
                    String.format("UPDATE person " +
                                    "SET first_name = '%s', last_name = '%s', type = '%s', calendar_id = %d " +
                                    "WHERE id = %d;",
                            entity.getFirstName(),
                            entity.getLastName(),
                            entity.getType(),
                            entity.getCalendarId(),
                            entity.getId()
                    );
            DBConnector.getInstance().executeUpdate(updateQuery);
            return entity;
        }
    }

    public Person findById(Long id) {
    	if(id == null)
    		return null;
    	String selectQuery = String.format("SELECT * FROM person WHERE id = %d;", id);
    	ResultSet resultSet = DBConnector.getInstance().executeQuery(selectQuery);
    	return personTransformer.toModel(resultSet);
    }

    public List<Person> findAll() {
        String allQuery = "SELECT * FROM person";
        ResultSet result = DBConnector.getInstance().executeQuery(allQuery);
        return personTransformer.toModelList(result);
    }

    public boolean delete(Person entity) {
        if(entity == null || entity.getId() == null)
        	return false;
        String deleteQuery = String.format("DELETE FROM person WHERE id = %d;", entity.getId());
		DBConnector.getInstance().executeUpdate(deleteQuery);
		return true;
    }

}
