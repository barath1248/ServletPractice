<%@page import="com.bean.AdminBean"%>
<%@page import="com.bean.ProductBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Products</title>
</head>
<body>

<center>

<%
AdminBean ab = (AdminBean)session.getAttribute("adminbean");
ArrayList<ProductBean> al = (ArrayList<ProductBean>)session.getAttribute("productlist");
%>

<h2>Welcome <%= ab.getFname() %></h2>
<h3>These are your products</h3>

<%
if(al == null || al.isEmpty()){
%>
    <h3>No Products Available.</h3>
<%
}
else{
%>

<table border="1" cellpadding="10" cellspacing="0">
    <tr>
        <th>Product Code</th>
        <th>Product Name</th>
        <th>Company</th>
        <th>Price</th>
        <th>Quantity</th>
    </tr>

<%
for(ProductBean pb : al){
%>

    <tr>
        <td><%= pb.getPCODE() %></td>
        <td><%= pb.getPNAME() %></td>
        <td><%= pb.getPCOMPANY() %></td>
        <td><%= pb.getPPRICE() %></td>
        <td><%= pb.getPQTY() %></td>
    </tr>

<%
}
%>

</table>

<%
}
%>

<br><br>


<a href="logout">Logout</a>

</center>

</body>
</html>