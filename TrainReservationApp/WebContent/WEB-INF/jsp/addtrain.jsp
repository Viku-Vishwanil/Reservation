<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Train</title>
</head>
<body>
<form action="savetrain" method="post">
<label>Train No : </label>
<input type="number" name="tno" placeholder="Enter train no" required="required"><br><br>
<label>Train Name : </label>
<input type="text" name="tname" placeholder="Enter train name" required="required"><br><br>
<label>Source Station : </label>
<input type="text" name="sstation" placeholder="Enter source station" required="required"><br><br>
<label>Departure time : </label>
<input type="time" name="deptime" placeholder="Enter dept time" required="required"><br><br>
<label>Destination Station : </label>
<input type="text" name="dstation" placeholder="Enter destination station" required="required"><br><br>
<label>Arrival time : </label>
<input type="time" name="arrivaltime" placeholder="EnterArrival time" required="required"><br><br>
<input type="submit" value="submit">
<input type="reset">
</form>
</body>
</html>