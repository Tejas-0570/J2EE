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

@WebServlet("/insert-record")
public class InsertRecordServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		String dbName = req.getParameter("dbName");
		String tableName = req.getParameter("tableName");
		String columnName = req.getParameter("columns");
		String values = req.getParameter("values");
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		try {
			// Connection to database
			Connection con = ConnectionManager.getConnectionToDatabase(dbName);
			System.out.println("Connected");
			
			// Create Statement
			String Query = "INSERT INTO "+tableName+" ( "+columnName+" )"+" VALUES ( "+values+" );";
			System.out.print(Query);	
			PreparedStatement ps = con.prepareStatement(Query);
			
			// Execute Statement
			ps.executeUpdate();
		    out.print("<h2>Record Inserted</h2>");
		    
		    
		    ps.close();
		    con.close();
			
		} catch (SQLException e) {
			out.print("<h2>'"+e+"'</h2>");
		}
		
		
	}
}
