<%@page import="com.bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile</title>
</head>
<body>
	<center>
		<h1>
			<%
              String firstName=(String)request.getAttribute("fname");
			  UserBean ub=(UserBean)application.getAttribute("userBean");
			  String s=ub.getUb_password();
			  String hiddenpassword=s.substring(0,1)+"***"+s.substring(s.length()-1);
			  out.println("This session belongs to "+firstName+"<br><br>");
			  out.println("---------------profile details------------------"+"<br><br>");
			  out.println("Username: "+ub.getUb_username()+"<br><br>");
			  out.println("Password: "+hiddenpassword+"<br><br>");
			  out.println("FirstName: "+ub.getUb_firstname()+"<br><br>");
			  out.println("LastName: "+ub.getUb_lastname()+"<br><br>");
			  out.println("MailID: "+ub.getUb_mailid()+"<br><br>");
			  out.println("phone: "+ub.getUb_phone()+"<br><br>");
			%>
			<a href="edit">Edit Profile</a><br><br>
			<a href="logout">Logout</a>
		</h1>
</body>
</html>