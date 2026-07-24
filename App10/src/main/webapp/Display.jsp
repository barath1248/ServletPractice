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
                String name=(String)request.getParameter("uname");
			    String msg1=(String)application.getAttribute("msg1");
			    String msg2=application.getInitParameter("msg2");
			    String msg3=(String)request.getAttribute("msg3");
			    String msg4=(String)request.getAttribute("msg4");
			    
			    out.println("welcome "+name+"<br><br>");
			    out.println("Servlet-Context: "+msg1+" (Servlet)"+"<br><br>");
			    out.println("Servlet-Context: "+msg2+" (web.xml)"+"<br><br>");
			    out.println("Servlet-Name: "+application.getServerInfo()+"<br><br>");
			    out.println("---------------------------------------"+"<br><br>");
			    out.println("Servlet-config: "+msg3+" (Servlet)"+"<br><br>");
			    out.println("Servlet-config: "+msg4+" (web.xml)"+"<br><br>");
			%>
		</h1>
</body>
</html>