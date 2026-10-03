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
        String ageStr = request.getParameter("age");
        String gender = request.getParameter("gender");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("confirmPassword");
        
        if (name == null || ageStr == null || password == null || confirmPassword == null) {
            out.print("<script>alert('Invalid form submission.'); window.location.href='PatientSignup.jsp';</script>");
            return;
        }
        
        if (!password.equals(confirmPassword)) {
            out.print("<script>alert('Password & Confirm Password do not match!'); window.location.href='PatientSignup.jsp';</script>");
            return; 
        }
        
        int age = 0;
        try{
        	age = Integer.parseInt(ageStr);
        } catch (NumberFormatException e){
        	out.print("<script>alert('Please enter valid age');window.location.href='PatientSignup.jsp';</script>");
        	return;
        }
        
        Connection con = ConnectionManager.getConnection();
        // This exposes our code to SQL injection vulnerabilities and introduces syntax bugs --> Use placeholders (?) instead of string concatenation
        //String query = "INSERT INTO patient VALUES ('"+UUID.randomUUID().toString()+"','"+name+"', '"+age+"', '"+gender+"', '"+phone+"', '"+email+"', '"+password+"')";
        
        String query = "INSERT INTO patient (ID, name, age, gender, phone, email, password) VALUES (?,?,?,?,?,?,?)";
        
        PreparedStatement ps = con.prepareStatement(query);
        
        ps.setString(1, UUID.randomUUID().toString());
        ps.setString(2, name);
        ps.setInt(3, age);
        ps.setString(4, gender);
        ps.setString(5, phone);
        ps.setString(6, email);
        ps.setString(7, password);
        
        ps.executeUpdate();
        
        out.print("<script>alert('Registration Successful!');window.location.href='PatientDashboard.jsp';</script>");
        
        
        
    
    
    %>

</body>
</html>