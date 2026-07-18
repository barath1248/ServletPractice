<%@page import="com.bean.AdminBean"%>
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
			AdminBean ab = (AdminBean) request.getAttribute("adminbean");
			out.println("welcome " + ab.getFname());
			%>
			<a href="Add">Add Product</a>
            <a href="view">View Product</a>
            <a href="logout">Logout</a>
		</h1>
</body>
</html>