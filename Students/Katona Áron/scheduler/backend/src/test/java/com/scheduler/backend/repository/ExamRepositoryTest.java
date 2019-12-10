package com.scheduler.backend.repository;

import com.scheduler.backend.model.Exam;
import com.scheduler.backend.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExamRepositoryTest {

    private DBConnector dbConnector = DBConnector.getInstance();
    private ExamRepository examRepository = new ExamRepository();
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    List<Exam> exams = List.of(
            new Exam(new Date(dateFormat.parse("2019-11-12 10:00:00").getTime()),
                    new Date(dateFormat.parse("2019-11-12 14:00:00").getTime())),
            new Exam(new Date(dateFormat.parse("2019-11-12 14:30:00").getTime()),
                    new Date(dateFormat.parse("2019-11-12 16:00:00").getTime()))
    );

    ExamRepositoryTest() throws ParseException {
    }

    @BeforeEach
    void setUp() {
        dbConnector.executeUpdate("SET FOREIGN_KEY_CHECKS = 0;");
        dbConnector.executeUpdate("TRUNCATE TABLE exam;");
        dbConnector.executeUpdate("ALTER TABLE exam AUTO_INCREMENT = 1;");
        dbConnector.executeUpdate("SET FOREIGN_KEY_CHECKS = 1;");
    }

    @Test
    void saveOne() {
        Exam exam = exams.get(0);

        Exam savedExam = examRepository.save(exam);
        Assertions.assertEquals(exam, savedExam);
        Assertions.assertEquals(1, savedExam.getId());

        Exam foundExam = examRepository.findById(savedExam.getId());
        Assertions.assertEquals(savedExam, foundExam);
    }

    @Test
    void saveMany() {
        for (int i = 0; i < exams.size(); i++) {
            Exam exam = exams.get(i);

            Exam savedExam = examRepository.save(exam);
            Assertions.assertEquals(exam, savedExam);
            Assertions.assertEquals(i + 1, savedExam.getId());

            Exam foundExam = examRepository.findById(savedExam.getId());
            Assertions.assertEquals(savedExam, foundExam);
        }
    }

    @Test
    void findById() {
    }

    @Test
    void findAll() {
    }

    @Test
    void delete() {
    }
}
