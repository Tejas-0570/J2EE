package com.dbmanager.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dbmanager.dao.ConnectionManager;
@WebServlet("/create-database")
public class CreateDatabaseServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String dbname = req.getParameter("dbName");
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		
		try {
			// Create Connection
			Connection con = ConnectionManager.getConnection();
			
			// Create Statement
			String Query = "CREATE DATABASE IF NOT EXISTS "+dbname;
			PreparedStatement ps = con.prepareStatement(Query);
			
			// Execute Statement
			ps.executeUpdate();
			
			out.println("<h2>Database created successfully!</h2>");
			out.println("<p>Database Name: " + dbname + "</p>");
			
			ps.close();
			con.close();
			
		} catch (SQLException e) {
			out.print("<h3>'"+e+"'</h3>");
		}
	}

}
