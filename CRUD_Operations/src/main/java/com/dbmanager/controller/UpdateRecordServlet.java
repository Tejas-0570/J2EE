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

@WebServlet("/update")
public class UpdateRecordServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		String dbName = req.getParameter("dbName");
		String tableName = req .getParameter("tableName");
		String setColumn = req.getParameter("setColumn");
		String setValue = req.getParameter("setValue");
		String whereColumn = req.getParameter("whereColumn");
		String whereValue = req.getParameter("whereValue");
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		try {
			// Create connection
			Connection con = ConnectionManager.getConnectionToDatabase(dbName);
			
			// Create Statement
			String Query = "UPDATE "+tableName+" SET "+setColumn+" = "+setValue+" WHERE "+whereColumn+" = "+whereValue+";";
			PreparedStatement ps = con.prepareStatement(Query);
			
			// Execute Statement
			ps.executeUpdate();
			
			out.print("<h2>Record Updated Successfully</h2>");
			out.print("<h4>Updated Value: '"+setValue+"'</h4>");
			
			ps.close();
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
			out.print("<h2>'"+e+"'</h2>");
		}
	}
}
