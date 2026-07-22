<%@page import="com.bean.ProductBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Buy-Product</title>
</head>
<body>
	<center>
		<h2>
			<%
              	ProductBean pb=(ProductBean)request.getAttribute("pdata");
			    out.println("Product details"+"<br><br>");
			%>
			<form action="ups" method="post">
			 PCODE:<input type="text" name="pcode" value="<%= pb.getPCODE() %>" readonly><br><br>
			 PNAME:<input type="text" name="pcode" value="<%= pb.getPNAME() %>" readonly><br><br>
			 PCOMPANY:<input type="text" name="pcode" value="<%= pb.getPCOMPANY() %>" readonly><br><br>
			 PRICE:<input type="text" name="pcode" value="<%= pb.getPPRICE() %>" readonly><br><br>
			 PQTY:<input type="text" name="pcode" value="<%= pb.getPQTY() %>" readonly><br><br>
			 Required Number:<input type="text" name="reqno"><br><br>
			 <input type="submit" value="Buy">
			</form>
		</h2>
</body>
</html>