package com.scheduler.backend.repository;

import com.scheduler.backend.model.Calendar;
import com.scheduler.backend.transformer.CalendarTransformer;
import com.scheduler.backend.transformer.LastInsertIdTransformer;

import java.sql.ResultSet;
import java.util.List;

public class CalendarRepository implements Repository<Calendar> {

    private CalendarTransformer calendarTransformer;
    private LastInsertIdTransformer lastInsertIdTransformer;

    public CalendarRepository() {
        this.calendarTransformer = new CalendarTransformer();
        this.lastInsertIdTransformer = new LastInsertIdTransformer();
    }

    @Override
    public Calendar save(Calendar entity) {
        if (entity.getId() == null) {
            String insertQuery ="INSERT INTO calendar () VALUES();";
            DBConnector.getInstance().executeUpdate(insertQuery);
            ResultSet resultSet = DBConnector.getInstance().executeQuery("SELECT LAST_INSERT_ID();");
            return findById(lastInsertIdTransformer.toModel(resultSet));
        } else {
            // there are no fields besides the id
            return entity;
        }
    }

    @Override
    public Calendar findById(Long id) {
        if(id == null)
            return null;
        String selectQuery = String.format("SELECT * FROM calendar WHERE id = %d;", id);
        ResultSet resultSet = DBConnector.getInstance().executeQuery(selectQuery);
        return calendarTransformer.toModel(resultSet);
    }

    @Override
    public List<Calendar> findAll() {
        String allQuery = "SELECT * FROM calendar";
        ResultSet result = DBConnector.getInstance().executeQuery(allQuery);
        return calendarTransformer.toModelList(result);
    }

    @Override
    public boolean delete(Calendar entity) {
        if(entity == null || entity.getId() == null)
            return false;
        String deleteQuery = String.format("DELETE FROM calendar WHERE id = %d;", entity.getId());
        DBConnector.getInstance().executeUpdate(deleteQuery);
        return true;
    }
}
