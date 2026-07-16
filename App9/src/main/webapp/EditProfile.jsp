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
			out.println("This session belongs to " + (String) request.getAttribute("fname")+"<br><br>");
			UserBean ub = (UserBean) application.getAttribute("userBean");
			%>
			<form action="update" method="post">
			 FirstName:<input type="text" name="ufname" value="<%= ub.getUb_firstname() %>"><br><br>
			 LastName:<input type="text" name="ulname" value="<%= ub.getUb_lastname() %>"><br><br>
			 MailID:<input type="text" name="umailid" value="<%= ub.getUb_mailid() %>"><br><br>
			 Phone:<input type="text" name="uphone" value="<%= ub.getUb_phone() %>"><br><br>
			 <input type="submit" value="update">
			</form>
		</h1>
</body>
</html>