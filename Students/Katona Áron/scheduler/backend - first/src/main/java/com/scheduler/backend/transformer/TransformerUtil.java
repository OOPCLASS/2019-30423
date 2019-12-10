package com.scheduler.backend.transformer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;

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

    public static java.util.Date getDate(ResultSet resultSet, String columnLabel) throws SQLException {
        Timestamp result = resultSet.getTimestamp(columnLabel);
        return resultSet.wasNull() ? null : new java.util.Date(result.getTime());
    }
}
