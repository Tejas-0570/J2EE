<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
  :root {
    --primary: #0d6e6e;
    --primary-dark: #095353;
    --accent: #e8f5f4;
    --text-dark: #1f2d2d;
    --text-muted: #5c6b6b;
    --border-soft: #d9e6e5;
  }

  * { box-sizing: border-box; }

  body {
    background-color: #f7faf9;
    color: var(--text-dark);
    font-family: 'Segoe UI', Roboto, Helvetica, Arial, sans-serif;
    display: flex;
    align-items: center;
    justify-content: center;
    flex-direction: column;
    min-height: 100vh;
    margin: 0;
    padding: 20px;
  }

  h2 {
    font-weight: 700;
    color: var(--text-dark);
    text-align: center;
    margin-bottom: 22px;
  }

  #errorMsg {
    background: #fdecec;
    border: 1px solid #f3c7c7;
    border-radius: 8px;
    padding: 10px 14px;
    font-size: 0.88rem;
    text-align: center;
    max-width: 340px;
    margin: 0 auto 18px;
  }

  form {
    background: #ffffff;
    border: 1px solid var(--border-soft);
    border-radius: 14px;
    box-shadow: 0 10px 30px rgba(13, 110, 110, 0.08);
    padding: 34px 28px;
    width: 100%;
    max-width: 360px;
    display: flex;
    flex-direction: column;
  }

  input[type="email"],
  input[type="password"] {
    width: 100%;
    padding: 11px 14px;
    margin-bottom: 16px;
    border: 1px solid var(--border-soft);
    border-radius: 8px;
    background: var(--accent);
    color: var(--text-dark);
    font-size: 0.92rem;
    font-family: inherit;
    outline: none;
    transition: border-color 0.15s ease, box-shadow 0.15s ease;
  }

  input[type="email"]::placeholder,
  input[type="password"]::placeholder {
    color: var(--text-muted);
  }

  input[type="email"]:focus,
  input[type="password"]:focus {
    border-color: var(--primary);
    box-shadow: 0 0 0 3px rgba(13, 110, 110, 0.12);
  }

  button[type="submit"] {
    background-color: var(--primary);
    border: none;
    color: #fff;
    font-weight: 600;
    padding: 11px 0;
    border-radius: 8px;
    width: 100%;
    font-size: 0.95rem;
    cursor: pointer;
    transition: transform 0.15s ease, box-shadow 0.15s ease, background-color 0.15s ease;
  }

  button[type="submit"]:hover {
    background-color: var(--primary-dark);
    transform: translateY(-2px);
    box-shadow: 0 8px 18px rgba(13, 110, 110, 0.18);
  }
</style>
</head>
<body>
<%
     String role = request.getParameter("role");
%>
 <h2>Login</h2>

	    <p id="errorMsg" style="color:red; display:none;">Invalid email or password.</p>

    <form action="HandlePatientLogin.jsp" method="post">
        <input type="hidden" name="role" value="<%= role != null ? role : ""%>">
        <input type="email" name="email" placeholder="Email" required><br>
        <input type="password" name="password" placeholder="Password" required><br>
        <button type="submit">Login</button>
    </form>
</body>
</html>