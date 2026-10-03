<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
    <%@ page import="com.dbmanager.dao.*" %>
    <%@ page import="java.util.UUID" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

      <%
          String name = request.getParameter("name");
          String phone = request.getParameter("phone");
          String email = request.getParameter("email");
          String gender = request.getParameter("gender");
          String specialization = request.getParameter("specialization");
          String qualification = request.getParameter("qualification");
          String regNumber = request.getParameter("regNumber");
          int experience = Integer.parseInt(request.getParameter("experience"));
          String password = request.getParameter("password");
          String confirmPassword = request.getParameter("confirmPassword");
          
          if (!password.equals(confirmPassword)) {
              out.print("<script>alert('Password & Confirm Password do not match!'); window.location.href='DoctorSignup.jsp';</script>");
              return; 
          }
          
          Connection con = ConnectionManager.getConnection();
          
          String query = "INSERT INTO doctor VALUES (?,?,?,?,?,?,?,?,?,?)";
          PreparedStatement ps = con.prepareStatement(query);
          
          ps.setString(1, UUID.randomUUID().toString());
          ps.setString(2, name);
          ps.setString(3, email);
          ps.setString(4, gender);
          ps.setString(5, phone);
          ps.setString(6, phone);
          ps.setString(7, phone);
          ps.setString(8, phone);
          ps.setString(9, phone);
          ps.setString(10, phone);
          
          
      
      
      %>

</body>
</html>