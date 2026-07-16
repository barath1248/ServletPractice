<%@page import="com.bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>
			<%
			UserBean ub = (UserBean) application.getAttribute("userBean");
			out.println("Welcome " + ub.getUb_firstname() + "<br><br>");
			%>
			<a href="view">View Profile</a><br>
			<a href="edit">Edit</a><br>
			<br> <a href="logout">Logout</a>
		</h1>
</body>
</html>