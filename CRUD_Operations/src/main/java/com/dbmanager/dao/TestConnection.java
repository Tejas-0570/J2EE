package com.dbmanager.dao;

import java.sql.Connection;
import java.sql.SQLException;

public class TestConnection {

	public static void main(String[] args) throws SQLException {
		
		Connection con  = ConnectionManager.getConnection();
		System.out.println("Success");
		con.close();

	}

}
