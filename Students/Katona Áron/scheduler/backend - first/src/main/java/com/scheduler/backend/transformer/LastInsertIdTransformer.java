package com.scheduler.backend.transformer;

import com.scheduler.backend.model.Person;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LastInsertIdTransformer implements Transformer<Long> {
    @Override
    public Long toModel(ResultSet resultSet) {
        try {
            if (resultSet.next()) {
                return resultSet.getLong("LAST_INSERT_ID()");
            }
        } catch (SQLException e) {
            // something went wrong here..
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Long> toModelList(ResultSet resultSet) {
        List<Long> lastInsertedIDs = new ArrayList<>();
        try {
            while (resultSet.next()) {
                lastInsertedIDs.add(resultSet.getLong("LAST_INSERT_ID()"));
            }
        } catch (SQLException e) {
            // something went wrong here..
            e.printStackTrace();
        }
        return lastInsertedIDs;
    }
}
