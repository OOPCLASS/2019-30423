package com.scheduler.backend.repository;

import com.scheduler.backend.model.Calendar;
import com.scheduler.backend.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class CalendarRepositoryTest {

    private DBConnector dbConnector = DBConnector.getInstance();
    private CalendarRepository calendarRepository = new CalendarRepository();

    @BeforeEach
    void setUp() {
        dbConnector.executeUpdate("SET FOREIGN_KEY_CHECKS = 0;");
        dbConnector.executeUpdate("TRUNCATE TABLE calendar;");
        dbConnector.executeUpdate("ALTER TABLE calendar AUTO_INCREMENT = 1;");
        dbConnector.executeUpdate("SET FOREIGN_KEY_CHECKS = 1;");
    }

    @Test
    void saveOne() {
        Calendar calendar = new Calendar();
        Calendar savedCalendar = calendarRepository.save(calendar);
        Assertions.assertEquals(1, savedCalendar.getId());
        Assertions.assertNotNull(calendarRepository.findById(1L));
    }

    @Test
    void saveMany() {
        for (int i = 0; i < 10; i++) {
            Calendar calendar = new Calendar();
            Calendar savedCalendar = calendarRepository.save(calendar);
            Assertions.assertEquals(i + 1, savedCalendar.getId());
            Assertions.assertNotNull(calendarRepository.findById(savedCalendar.getId()));
        }
    }

    @Test
    void findById() {
        for (int i = 0; i < 10; i++) {
            Calendar savedCalendar = calendarRepository.save(new Calendar());
        }
        for (long i = 0; i < 10; i++) {
            Assertions.assertEquals(i + 1, calendarRepository.findById(i + 1).getId());
        }
    }

    @Test
    void findByInvalidId() {
        Assertions.assertNull(calendarRepository.findById(11L));
        Assertions.assertNull(calendarRepository.findById(null));
    }

    @Test
    void findAll() {
        List<Calendar> calendars = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Calendar savedCalendar = calendarRepository.save(new Calendar());
            calendars.add(savedCalendar);
        }
        for(int i=0; i<calendars.size(); i++)
        {
            Assertions.assertEquals(i + 1, calendars.get(i).getId());
        }
        Assertions.assertEquals(calendars, calendarRepository.findAll());
    }

    @Test
    void deleteMany() {
        for (int i = 0; i < 4; i++) {
            Calendar savedCalendar = calendarRepository.save(new Calendar());
        }
        List<Calendar> calendars = new ArrayList<>(calendarRepository.findAll());
        final int[] indicesToDelete = {1, 0, 1, 0};
        for (int index : indicesToDelete) {
            Assertions.assertTrue(calendarRepository.delete(calendars.get(index)));
            calendars.remove(index);
            Assertions.assertEquals(calendars, calendarRepository.findAll());
        }
    }

    @Test
    void DeleteEmptyAndNewCalendar() {
        Assertions.assertFalse(calendarRepository.delete(null));
        Assertions.assertFalse(calendarRepository.delete(new Calendar()));
    }

    @Test
    void DeleteInvalidKey() {
        Calendar calendars = new Calendar();
        calendars.setId(22L);
        Assertions.assertTrue(calendarRepository.delete(calendars));
    }
}
