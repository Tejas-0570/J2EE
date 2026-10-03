<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>

<html lang="en">

<head>

<meta charset="ISO-8859-1">

<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Login</title>

<style>

/* ================================
       GLOBAL STYLES
       ================================ */
* {
	box-sizing: border-box;
	margin: 0;
	padding: 0;
	font-family: 'Segoe UI', Arial, sans-serif;
}

/* ================================
       PAGE BACKGROUND
       ================================ */
body {
	min-height: 100vh;
	display: flex;
	align-items: center;
	justify-content: center;
	padding: 30px 15px;
	background: radial-gradient(circle at top left, #e8f1ff 0%, transparent 35%),
		radial-gradient(circle at bottom right, #dbeafe 0%, transparent 35%),
		#f5f7fb;
}

/* ================================
       LOGIN CONTAINER
       ================================ */
.login-container {
	width: 100%;
	max-width: 430px;
	background: #ffffff;
	padding: 42px 40px;
	border-radius: 18px;
	border: 1px solid #e8ebf0;
	box-shadow: 0 20px 50px rgba(15, 23, 42, 0.10), 0 5px 15px
		rgba(15, 23, 42, 0.05);
	position: relative;
	overflow: hidden;
}

/* Top accent line */
.login-container::before {
	content: "";
	position: absolute;
	top: 0;
	left: 0;
	width: 100%;
	height: 4px;
	background: linear-gradient(90deg, #2563eb, #3b82f6);
}

/* ================================
       HEADING
       ================================ */
.login-container h2 {
	text-align: center;
	margin-bottom: 30px;
	color: #111827;
	font-size: 28px;
	font-weight: 700;
	letter-spacing: -0.5px;
}

/* ================================
       FORM GROUP
       ================================ */
.form-group {
	margin-bottom: 21px;
}

/* ================================
       LABEL
       ================================ */
.form-group label {
	display: block;
	margin-bottom: 8px;
	font-size: 14px;
	color: #374151;
	font-weight: 600;
}

/* ================================
       INPUT
       ================================ */
.form-group input {
	width: 100%;
	height: 48px;
	padding: 0 15px;
	border: 1px solid #d1d5db;
	border-radius: 9px;
	background: #ffffff;
	color: #111827;
	font-size: 14px;
	outline: none;
	transition: border-color 0.25s ease, box-shadow 0.25s ease;
}

/* Placeholder */
.form-group input::placeholder {
	color: #9ca3af;
}

/* Hover */
.form-group input:hover {
	border-color: #9ca3af;
}

/* Focus */
.form-group input:focus {
	border-color: #2563eb;
	box-shadow: 0 0 0 4px rgba(37, 99, 235, 0.10);
}

/* ================================
       LOGIN BUTTON
       ================================ */
.login-btn {
	width: 100%;
	height: 49px;
	margin-top: 5px;
	border: none;
	border-radius: 9px;
	background: #2563eb;
	color: #ffffff;
	font-size: 15px;
	font-weight: 600;
	cursor: pointer;
	box-shadow: 0 6px 15px rgba(37, 99, 235, 0.20);
	transition: background-color 0.25s ease, transform 0.2s ease, box-shadow
		0.25s ease;
}

/* Hover */
.login-btn:hover {
	background: #1d4ed8;
	transform: translateY(-1px);
	box-shadow: 0 9px 20px rgba(37, 99, 235, 0.25);
}

/* Click */
.login-btn:active {
	transform: translateY(0);
}

/* ================================
       REGISTER LINK
       ================================ */
.register-link {
	text-align: center;
	margin-top: 25px;
	padding-top: 20px;
	border-top: 1px solid #eef0f3;
	font-size: 14px;
	color: #6b7280;
}

.register-link a {
	color: #2563eb;
	text-decoration: none;
	font-weight: 600;
	margin-left: 3px;
	transition: color 0.2s ease;
}

.register-link a:hover {
	color: #1d4ed8;
	text-decoration: underline;
}

/* ================================
       RESPONSIVE DESIGN
       ================================ */
@media ( max-width : 480px) {
	body {
		padding: 20px 12px;
	}
	.login-container {
		padding: 35px 25px;
		border-radius: 15px;
	}
	.login-container h2 {
		font-size: 25px;
		margin-bottom: 25px;
	}
	.form-group {
		margin-bottom: 18px;
	}
	.form-group input {
		height: 46px;
	}
	.login-btn {
		height: 47px;
	}
}
</style>

</head>

<body>

<%
    String error = (String) request.getAttribute("error");

    if (error != null) {
%>

<script>
    window.onload = function() {
        alert("<%= error %>");
    };
</script>

<%
    }
%>

	<div class="login-container">

		<h2>Login</h2>

		<form action="LoginUser" method="post">

			<div class="form-group">

				<label for="email">Email Address</label> <input type="email"
					id="email" name="email" placeholder="Enter your email" required>

			</div>


			<div class="form-group">

				<label for="password">Password</label> <input type="password"
					id="password" name="password" placeholder="Enter your password"
					required>

			</div>


			<button type="submit" class="login-btn">Login</button>

		</form>


		<div class="register-link">

			Don't have an account? <a href="register">Register</a>

		</div>

	</div>

</body>

</html>
