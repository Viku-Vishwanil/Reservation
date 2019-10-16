<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>train details</title>
</head>
<body>
<TABLE>
					<thead>
							<tr>
								<th>Train no</th>
								<th>Train Name</th>
								<th>Source Station</th>
								<th>Arrival</th>
								<th>Departure</th>
								<th>Destination Station</th>
								
							</tr>
						</thead>
						<tbody>
 <c:forEach items="${trainerInfo}" var="train">
  <tr>
    <td>${train.trainNo}</td>
    <td>${train.trainName}</td>
    <td>${train.sourceStation}</td>
    <td>${train.arrivalTime}</td>
    <td>${train.departureTime}</td>
    <td>${train.destinationStation}</td>
    
     </tr>
</c:forEach>
</tbody>
</TABLE>

</body>
</html>