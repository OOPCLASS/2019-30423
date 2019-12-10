package com.scheduler.backend.transformer;

import com.scheduler.backend.model.Exam;
import com.scheduler.backend.model.Person;
import com.scheduler.backend.model.PersonType;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ExamTransformer implements Transformer<Exam> {
    @Override
    public Exam toModel(ResultSet resultSet) {
        try {
            if (resultSet.next()) {
                return buildExam(resultSet);
            }
        } catch (SQLException e) {
            // something went wrong here..
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Exam> toModelList(ResultSet resultSet) {
        List<Exam> exams = new ArrayList<>();
        try {
            while (resultSet.next()) {
                Exam exam = buildExam(resultSet);
                if (exam != null) {
                    exams.add(exam);
                }
            }
        } catch (SQLException e) {
            // something went wrong here..
            e.printStackTrace();
        }
        return exams;
    }

    private Exam buildExam(ResultSet resultSet) throws SQLException {
        Exam exam = new Exam();
        exam.setId(TransformerUtil.getLong(resultSet, "id"));
        exam.setFrom(TransformerUtil.getDate(resultSet, "date_from"));
        exam.setTo(TransformerUtil.getDate(resultSet, "date_to"));
        return exam;
    }
}
