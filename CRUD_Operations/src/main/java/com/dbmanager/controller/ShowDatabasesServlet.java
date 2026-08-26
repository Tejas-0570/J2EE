package com.dbmanager.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dbmanager.dao.ConnectionManager;

@WebServlet("/databases")
public class ShowDatabasesServlet  extends HttpServlet{

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		try {
			Connection con = ConnectionManager.getConnection();
			
			PreparedStatement ps = con.prepareStatement("SHOW DATABASES;");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				String name = rs.getString("Database");
				
				out.print("<h2>'"+name+"'</h2>");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			out.print("<h2>'"+e+"'</h2>");
		}
	}
}
