<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><h1>
 <jsp:useBean id="ub" class="com.pack1.UserBean" scope="session"></jsp:useBean>
 <jsp:setProperty property="userName" param="uname" name="ub"/>
 <jsp:setProperty property="userMail" param="umail" name="ub"/>
 <jsp:setProperty property="userPhone" param="uphone" name="ub"/>
 Details Added Successfully!<br><br>
 <a href="View.jsp">View Bean</a>
 </h1>
</body>
</html>