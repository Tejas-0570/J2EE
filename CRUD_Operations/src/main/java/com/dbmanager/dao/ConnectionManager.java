package com.dbmanager.dao;

import java.lang.Class;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class ConnectionManager {
	private static String DB_URL = "jdbc:mysql://localhost:3306/";
	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "";
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Driver not found: ", e);
		}
	}
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
	}
	
	public static Connection getConnectionToDatabase(String database) throws SQLException{
		return DriverManager.getConnection(DB_URL+database, DB_USERNAME, DB_PASSWORD);
	}
}
