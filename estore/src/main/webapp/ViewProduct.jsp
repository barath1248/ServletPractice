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
			ArrayList<ProductBean> al=(ArrayList<ProductBean>)session.getAttribute("productlist");
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
							" "+"<a href='edit?pcode="+pb.getPCODE()+"'>Edit</a>"+
							" "+"<a href='delete?pcode="+pb.getPCODE()+"'>Delete</a>"+
							"<br><br>");
				}
			}
			%>
			<a href="logout">Logout</a>
		</h1>
		
</body>
</html>