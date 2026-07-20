<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Result</title>

<style>
body{
    margin:0;
    font-family:Arial, Helvetica, sans-serif;
    background:#f2f2f2;
}

.container{
    width:400px;
    margin:100px auto;
    background:white;
    padding:30px;
    text-align:center;
    border-radius:10px;
    box-shadow:0 0 10px gray;
}

h2{
    color:green;
}

a{
    display:block;
    width:200px;
    margin:15px auto;
    padding:10px;
    text-decoration:none;
    color:white;
    background:#007BFF;
    border-radius:5px;
}

a:hover{
    background:#0056b3;
}
</style>

</head>
<body>

<div class="container">

    <%
        String data = (String)request.getAttribute("msg");
    %>

    <h2><%= data %></h2>

    <a href="AddProduct.html">Add Product</a>

    <a href="view1">View Products</a>

    <a href="logout">Logout</a>

</div>

</body>
</html>