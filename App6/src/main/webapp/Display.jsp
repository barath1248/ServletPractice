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
     <%
       String p_name=request.getParameter("pname");
       String p_id=request.getParameter("pid");
       String p_price=request.getParameter("price");
       String p_qty=request.getParameter("pqty");
       
       out.println("<center><h1>");
       out.println("Product Name : "+p_name+"<br><br>");
       out.println("Product ID : "+p_id+"<br><br>");
       out.println("Product price : "+p_price+"<br><br>");
       out.println("Product Qunatity : "+p_qty+"<br><br>");
       out.println("</h1></center>");

      %>

</body>
</html>