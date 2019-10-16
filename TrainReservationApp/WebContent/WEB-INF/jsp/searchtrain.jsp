<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Page</title>
</head>
<body>
<form action="searchtrain" method="post">
<label>Source Station : </label>
<input type="text" name="sStation" placeholder="Enter Source Station" required="required"><br><br>
<label>Destination Station : </label>
<input type="text" name="dStation" placeholder="Enter Destination Station" required="required"><br><br>
<input type="submit" value="Search">
<input type="reset">
</form>
</body>
</html>