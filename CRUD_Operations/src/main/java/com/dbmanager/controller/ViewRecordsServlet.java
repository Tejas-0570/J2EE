package com.dbmanager.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dbmanager.dao.ConnectionManager;

@WebServlet("/records")
public class ViewRecordsServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		String dbName = req.getParameter("dbName");
		String tableName = req.getParameter("tableName");
		 res.setContentType("text/html");
		 
		 PrintWriter out = res.getWriter();
		 
		 try {
			 // Create Connection
			 Connection con = ConnectionManager.getConnectionToDatabase(dbName);
			 
			 // Create Statement
			 String Query = "SELECT * FROM "+tableName;
			 PreparedStatement ps = con .prepareStatement(Query);
			 
			 // Execute Statement
			 ResultSet rs = ps.executeQuery();
			 
			 ResultSetMetaData metadata = rs.getMetaData();
			 
			 int columnCount = metadata.getColumnCount();
			 while(rs.next()) {
				 for(int i = 0; i< columnCount; i++) {
					 Object value = rs.getObject(i);
					 
					 out.print(value+" ");
				 }
				 out.print("<br>");
			 }
			 
			 
		 } catch (SQLException e) {
			 e.printStackTrace();
			 out.print("<h2>" + e.getMessage() + "</h2>");
		 }

}
	
}
