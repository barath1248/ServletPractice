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
			  out.println("This session belongs to " + (String) request.getAttribute("fname")+"<br><br>");
              String data=(String)request.getAttribute("data");
              out.println(data+"<br><br>");
			%>
			<a href="view">View Profile</a><br>
			<a href="edit">Edit</a><br>
			<br> <a href="logout">Logout</a>
		</h1>
</body>
</html>