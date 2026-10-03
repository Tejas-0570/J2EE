package com.dbmanager.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	
	private final static String DB_URL = "jdbc:postgresql://localhost:5432/CityCareHospital";
	private final static String DB_USERNAME = "postgres";
	private final static String DB_PASSWORD = "TejasPostgres@0570";
	
	static {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Driver not found: ", e);
		}
	}
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
	}
}
