<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page errorPage="Error.jsp" %>
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
               int num1=Integer.parseInt(request.getParameter("num1"));
			   int num2=Integer.parseInt(request.getParameter("num2"));
			   out.println("Result is: "+(num1+num2)+"<br><br>");
			   out.println("Date: "+ request.getParameter("data"));
			%>
		</h1>
		<%@ include file="input.html" %>
</body>
</html>