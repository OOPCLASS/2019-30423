package com.scheduler.backend.transformer;

import java.sql.ResultSet;
import java.sql.SQLException;

public final class TransformerUtil {

    private TransformerUtil() {
    }

    public static Long getLong(ResultSet resultSet, String columnLabel) throws SQLException {
        Long result = resultSet.getLong(columnLabel);
        return resultSet.wasNull() ? null : result;
    }

    public static String getString(ResultSet resultSet, String columnLabel) throws SQLException {
        String result = resultSet.getString(columnLabel);
        return resultSet.wasNull() ? null : result;
    }
}
