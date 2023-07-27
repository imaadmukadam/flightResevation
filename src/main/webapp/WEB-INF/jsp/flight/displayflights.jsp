<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>flights</title>
</head>
<body>
<table>
<tr>
<th>airlines</th>
<th>departure city</th>
<th>arrival city</th>
<th>departure time</th>
<tr>
<c:forEach items="${flights}" var="flight">
<tr>
<td>${flight.operatingAirlines}</td>
<td>${flight.departure}</td>
<td>${flight.arrivalcity}</td>
<td>${flight.estimatedDepartureTime}</td>
<td><a href="showCompleteReservation?flightId=${flight.id}">select</a></td>

</tr>
</c:forEach>
</table>

</body>
</html>