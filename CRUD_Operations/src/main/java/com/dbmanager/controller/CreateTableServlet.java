package com.dbmanager.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dbmanager.dao.ConnectionManager;

@WebServlet("/create-table")
public class CreateTableServlet extends HttpServlet{
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{

		String dbName = req.getParameter("dbName");
		String tableName = req.getParameter("tableName");
		String columns = req.getParameter("columns");
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		
		try {
			// Create Connection
			Connection con = ConnectionManager.getConnectionToDatabase(dbName);
			
			// Create Statement
			String createTableQuery =
				    "CREATE TABLE " + tableName + " ("+columns+")";
			PreparedStatement ps = con.prepareStatement(createTableQuery);
			
			// Execute Statement
			ps.executeUpdate();
			
			out.println("<h2>Table created successfully!</h2>");
			out.println("<p>Table Name: " + tableName + "</p>");
			
			ps.close();
			con.close();
			
			
			
;		} catch (SQLException e) {
			out.print("<h2>'"+e	+"'</h2>");
		}
	}
}
