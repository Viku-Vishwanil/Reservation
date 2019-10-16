<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
<h1>WelCome To Home Page</h1>
<h3 align="right">Welcome ${param.username}</h3>
<h3 align="right"><a href="logout">Logout</a></h3>
<a href="addtrain">Add Train</a>
<a href="search">Search Train</a>
</body>
</html>