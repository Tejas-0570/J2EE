<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="ISO-8859-1">

<title>Users</title>

<style>

/* =========================
       GLOBAL
       ========================= */
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-family: "Segoe UI", Arial, sans-serif;
}

/* =========================
       BODY
       ========================= */
body {
	min-height: 100vh;
	padding: 50px 30px;
	background: #f4f7fb;
	color: #1f2937;
}

/* =========================
       TABLE CONTAINER EFFECT
       ========================= */
body {
	display: flex;
	justify-content: center;
	align-items: flex-start;
}

/* =========================
       TABLE
       ========================= */
table {
	width: 100%;
	max-width: 1100px;
	border-collapse: separate;
	border-spacing: 0;
	background: #ffffff;
	border: 1px solid #e5e7eb;
	border-radius: 14px;
	overflow: hidden;
	box-shadow: 0 10px 30px rgba(15, 23, 42, 0.08);
}

/* =========================
       TABLE HEADER
       ========================= */
th {
	padding: 17px 20px;
	background: #1e293b;
	color: #ffffff;
	font-size: 14px;
	font-weight: 600;
	text-align: left;
	letter-spacing: 0.2px;
	white-space: nowrap;
}

/* =========================
       TABLE DATA
       ========================= */
td {
	padding: 16px 20px;
	border-bottom: 1px solid #edf0f3;
	color: #4b5563;
	font-size: 14px;
	background: #ffffff;
	transition: background-color 0.2s ease;
}

/* =========================
   ACTION LINKS
   ========================= */
td:last-child {
	white-space: nowrap;
}

td:last-child a {
	text-decoration: none;
	font-size: 14px;
	font-weight: 600;
	transition: all 0.2s ease;
}

/* Edit */
td:last-child a:first-child {
	color: #2563eb;
}

td:last-child a:first-child:hover {
	color: #1d4ed8;
	text-decoration: underline;
}

/* Delete */
td:last-child a:last-child {
	color: #dc2626;
}

td:last-child a:last-child:hover {
	color: #b91c1c;
	text-decoration: underline;
}

/* =========================
       ROW HOVER
       ========================= */
tr:hover td {
	background: #f8fafc;
}

/* =========================
       LAST ROW
       ========================= */
tr:last-child td {
	border-bottom: none;
}

/* =========================
       ID COLUMN
       ========================= */
td:first-child {
	color: #2563eb;
	font-weight: 600;
}

/* =========================
       USERNAME
       ========================= */
td:nth-child(2) {
	color: #111827;
	font-weight: 600;
}

/* =========================
       EMAIL
       ========================= */
td:nth-child(3) {
	color: #4b5563;
}

/* =========================
       PASSWORD COLUMNS
       ========================= */
td:nth-child(4), td:nth-child(5) {
	color: #6b7280;
}

/* =========================
       RESPONSIVE TABLE
       ========================= */
@media ( max-width : 800px) {
	body {
		padding: 25px 15px;
	}
	table {
		font-size: 13px;
	}
	th, td {
		padding: 13px 12px;
	}
}

/* =========================
       MOBILE
       ========================= */
@media ( max-width : 600px) {
	body {
		padding: 20px 10px;
	}
	table {
		display: block;
		overflow-x: auto;
		white-space: nowrap;
		border-radius: 10px;
	}
	th, td {
		padding: 12px 15px;
	}
}
</style>

</head>

<body>

	<table border="1px">

		<tr>

			<th>ID</th>

			<th>Username</th>

			<th>Email</th>

			<th>Password</th>

			<th>Confirm Passwors</th>

			<th>Action</th>

		</tr>


		<c:forEach items="${temp}" var="e">

			<tr>

				<td>${e.id}</td>

				<td>${e.fullname}</td>

				<td>${e.email}</td>

				<td>${e.password}</td>

				<td>${e.confirmPassword}</td>

				<td><a href="Edit/${e.id }">Edit | </a> <a href="Delete/${e.id }">Delete</a></td>

			</tr>

		</c:forEach>

	</table>

</body>

</html>
