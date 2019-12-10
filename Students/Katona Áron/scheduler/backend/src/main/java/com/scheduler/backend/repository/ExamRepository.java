package com.scheduler.backend.repository;

import com.scheduler.backend.model.Exam;
import com.scheduler.backend.transformer.ExamTransformer;
import com.scheduler.backend.transformer.LastInsertIdTransformer;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.TimeZone;

public class ExamRepository implements Repository<Exam> {

    private ExamTransformer examTransformer;
    private LastInsertIdTransformer lastInsertIdTransformer;
    private SimpleDateFormat dateFormat;

    public ExamRepository() {
        this.examTransformer = new ExamTransformer();
        this.lastInsertIdTransformer = new LastInsertIdTransformer();
        this.dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.dateFormat.setTimeZone(TimeZone.getTimeZone("UTC+2"));
    }

    @Override
    public Exam save(Exam entity) {
        if (entity.getId() == null) {
            String insertQuery =
                    String.format("INSERT INTO exam (date_from, date_to) VALUES('%s','%s');",
                            dateFormat.format(entity.getFrom()),
                            dateFormat.format(entity.getTo())
                    );
            DBConnector.getInstance().executeUpdate(insertQuery);
            ResultSet resultSet = DBConnector.getInstance().executeQuery("SELECT LAST_INSERT_ID();");
            return findById(lastInsertIdTransformer.toModel(resultSet));
        } else {
            String updateQuery =
                    String.format("UPDATE exam " +
                                    "SET date_from = '%s', date_to = '%s' " +
                                    "WHERE id = %d;",
                            dateFormat.format(entity.getFrom()),
                            dateFormat.format(entity.getTo()),
                            entity.getId()
                    );
            DBConnector.getInstance().executeUpdate(updateQuery);
            return entity;
        }
    }

    @Override
    public Exam findById(Long id) {
        if (id == null)
            return null;
        String selectQuery = String.format("SELECT * FROM exam WHERE id = %d;", id);
        ResultSet resultSet = DBConnector.getInstance().executeQuery(selectQuery);
        return examTransformer.toModel(resultSet);
    }

    @Override
    public List<Exam> findAll() {
        String allQuery = "SELECT * FROM exam";
        ResultSet result = DBConnector.getInstance().executeQuery(allQuery);
        return examTransformer.toModelList(result);
    }

    @Override
    public boolean delete(Exam entity) {
        if (entity == null || entity.getId() == null)
            return false;
        String deleteQuery = String.format("DELETE FROM exam WHERE id = %d;", entity.getId());
        DBConnector.getInstance().executeUpdate(deleteQuery);
        return true;
    }
}
