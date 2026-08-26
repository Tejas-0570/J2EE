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

@WebServlet("/delete")
public class DeleteRecordServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		String dbName = req.getParameter("dbName");
		String tableName = req .getParameter("tableName");
		String whereColumn = req.getParameter("whereColumn");
		String whereValue = req.getParameter("whereValue");
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		try {
			// Create Connection
			Connection con = ConnectionManager.getConnectionToDatabase(dbName);
			
			// Create Statement
			String Query = "DELETE FROM "+tableName+" WHERE "+whereColumn+" = "+whereValue+";";
			PreparedStatement ps = con.prepareStatement(Query);
			
			// Execute Statement
			int rows = ps.executeUpdate();
			if(rows != 0) {
				out.print("<h2>Record Deleted Successfully</h2>");
			} else {
				out.print("<h2>0 rows deleted	<h2>");
			}
			
			
			ps.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
			out.print("<h2>'"+e+"'</h2>");
		}
		
		
	}
}
