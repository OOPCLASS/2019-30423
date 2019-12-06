package com.scheduler.backend.service;

import com.scheduler.backend.model.Calendar;
import com.scheduler.backend.repository.CalendarRepository;

import java.util.List;

public class CalendarService implements Service<Calendar> {

    private CalendarRepository calendarRepository;

    public CalendarService() {
        this.calendarRepository = new CalendarRepository();
    }

    @Override
    public Calendar save(Calendar entity) {
        return calendarRepository.save(entity);
    }

    @Override
    public Calendar findById(Long id) {
        return calendarRepository.findById(id);
    }

    @Override
    public List<Calendar> findAll() {
        return calendarRepository.findAll();
    }

    @Override
    public boolean delete(Calendar entity) {
        return calendarRepository.delete(entity);
    }
}
