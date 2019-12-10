package com.scheduler.backend.transformer;

import com.scheduler.backend.model.Calendar;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CalendarTransformer implements Transformer<Calendar> {
    @Override
    public Calendar toModel(ResultSet resultSet) {
        try {
            if (resultSet.next()) {
                return buildCalendar(resultSet);
            }
        } catch (SQLException e) {
            // something went wrong here..
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Calendar> toModelList(ResultSet resultSet) {
        List<Calendar> calendars = new ArrayList<>();
        try {
            while (resultSet.next()) {
                Calendar calendar = buildCalendar(resultSet);
                if (calendar != null) {
                    calendars.add(calendar);
                }
            }
        } catch (SQLException e) {
            // something went wrong here..
            e.printStackTrace();
        }
        return calendars;
    }

    private Calendar buildCalendar(ResultSet resultSet) throws SQLException {
        Calendar calendar = new Calendar();
        calendar.setId(TransformerUtil.getLong(resultSet, "id"));
        return calendar;
    }
}
