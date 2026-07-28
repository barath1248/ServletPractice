<%@page import="java.util.Date"%>
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
             String s=request.getParameter("choice");
             if("Add".equals(s))
             {
        %>
			    <jsp:forward page="Addition.jsp">
				<jsp:param name="data" value="<%= new java.util.Date() %>"/>
				</jsp:forward>
		<%
             }
             else{
        %>
				<jsp:forward page="Subtraction.jsp">
				<jsp:param name="data" value="<%= new java.util.Date() %>"/>
				</jsp:forward>
		<%
             }
         %>
				</h1>
</body>
</html>