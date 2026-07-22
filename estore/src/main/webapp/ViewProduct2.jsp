<%@page import="com.bean.CustomerBean"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.bean.ProductBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products data</title>
</head>
<body>
<center>
		<h1>
			<%
			CustomerBean cb=(CustomerBean)session.getAttribute("customerbean");
			ArrayList<ProductBean> al=(ArrayList<ProductBean>)session.getAttribute("products");
			out.println("Hello ! "+cb.getCFNAME()+"<br>"+"These are the products available!"+"<br><br>");
			if(al.size()==0){
				out.println("Records are empty!");
			}
			else{
				Iterator<ProductBean> i= al.iterator();
				while(i.hasNext()){
					ProductBean pb=i.next();
					out.println(pb.getPCODE()+
							" "+pb.getPNAME()+
							" "+pb.getPCOMPANY()+
							" "+pb.getPPRICE()+
							" "+pb.getPQTY()+
							" "+"<a href='buy?pcode="+pb.getPCODE()+"'>Buy</a>"+
							" "+"<br><br>");
				}
			}
			%>
			<a href="logout">Logout</a>
		</h1>
</body>
</html>