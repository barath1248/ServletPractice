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
			<%!
			 int findFactorial(int num){
				int fact=1;
				for(int i=1;i<=num;i+=1){
					fact=fact*i;
				}
				return fact;
			}
			%>
			<%
			 int value=Integer.parseInt(request.getParameter("num"));
			int res=findFactorial(value);
			out.println("Factorial is : "+res+"<br><br>");
			%>
		</h1>
		<%@ include file="index.html" %>
</body>
</html>