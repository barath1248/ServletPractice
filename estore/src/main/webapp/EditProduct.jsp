<%@page import="com.bean.AdminBean"%>
<%@page import="com.bean.ProductBean"%>
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
		 <h2><u>Product Details</u></h2>
			<%
               AdminBean abean=(AdminBean)session.getAttribute("adminBean");
			   ProductBean pb=(ProductBean) request.getAttribute("pbean");
			%>
			<form action="update" method="post">
			 Product Price:<input type="text" name="pprice" value="<%= pb.getPPRICE() %>"><br><br>
			 Product Quantity:<input type="text" name="pqty" value="<%= pb.getPQTY() %>"><br><br>
			 <input type="hidden" name="pcode" value="<%= pb.getPCODE() %>">
			 <input type="submit"value="update">
			</form>
		</h1>
</body>
</html>