<%@page import="com.bean.CustomerBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Home</title>
</head>
<body>
	<center>
		<h1>
			<%
               CustomerBean cb=(CustomerBean)session.getAttribute("customerbean");
			   out.println("Welcome "+ cb.getCFNAME()+"<br><br>");
			%>
			<a href="view2">View Products</a><br><br>
			<a href="logout">Logout</a>
		</h1>
</body>
</html>