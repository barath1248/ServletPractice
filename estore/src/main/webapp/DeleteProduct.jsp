<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Deletion update</title>

<style>
body {
	margin: 0;
	font-family: Arial, Helvetica, sans-serif;
	background: #f2f2f2;
}

.container {
	width: 400px;
	margin: 100px auto;
	background: white;
	padding: 30px;
	text-align: center;
	border-radius: 10px;
	box-shadow: 0px 0px 10px gray;
}

h2 {
	color: #333;
}

a {
	display: block;
	width: 200px;
	margin: 15px auto;
	padding: 12px;
	text-decoration: none;
	color: white;
	background: #007BFF;
	border-radius: 5px;
	font-size: 18px;
}

a:hover {
	background: #0056b3;
}
</style>

</head>
<body>
	<center>
		<h1>
			<%
			String data = (String) request.getAttribute("data");
			out.println(data + "<br><br>");
			%>
			<a href="AddProduct.html">Add Product</a>
			<a href="view1">View Products</a>
		    <a href="logout">Logout</a>
		</h1>
</body>
</html>