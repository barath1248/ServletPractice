<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
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
			<%
			ArrayList<ProductBean> al=(ArrayList<ProductBean>)request.getAttribute("list");
			if(al.size()==0){
				out.println("Records are empty!");
			}
			else{
				Iterator<ProductBean> i= al.iterator();
				while(i.hasNext()){
					ProductBean pb=i.next();
					out.println(pb.getP_CODE()+" "+pb.getP_NAME()+" "+pb.getP_COMPANY()+" "+pb.getP_PRICE()+" "+pb.getP_QTY()+"<br><br>");
				}
			}
			%>
		</h1>
		<%@include file="index.html"%>
</body>
</html>