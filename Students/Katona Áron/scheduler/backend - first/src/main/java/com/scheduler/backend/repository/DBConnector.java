package com.scheduler.backend.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * More on java JDBC: https://www.baeldung.com/java-jdbc
 * @author alex_
 */
public class DBConnector {

	private static final String HOST = "localhost";
	private static final String PORT = "3306";
	private static final String DB_NAME = "scheduler";
	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "test";

	private static DBConnector instance;
	private static Connection connection;

	private DBConnector() {
		try {
			String connectionString = String.format("jdbc:mysql://%s:%s/%s", HOST, PORT, DB_NAME);
			connection = DriverManager.getConnection(connectionString, DB_USERNAME, DB_PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static DBConnector getInstance() {
		if (instance == null) {
			instance = new DBConnector();
		}
		return instance;
	}

	/**
	 * Use this for SELECT statements
	 * 
	 * @param query SQL valid query
	 * @return {@link ResultSet}
	 * @throws SQLException .
	 */
	public ResultSet executeQuery(String query) {
		try {
			Statement stmt = connection.createStatement();
			return stmt.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Use this for DB updates
	 * 
	 * @param query SQL valid query
	 * @return either (1) the row count for SQL Data Manipulation Language (DML)
	 *         statements or (2) 0 for SQL statements that return nothing
	 * @throws SQLException .
	 */
	public int executeUpdate(String query) {
		try {
			Statement stmt = connection.createStatement();
			return stmt.executeUpdate(query);
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
