<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Airlines:${reservations.flight.operatingAirlines}
<br>
flightNumber:${reservations.flight.flightNumber}
<br>
departure:${reservations.flight.departure}
<br>
arrivalcity:${reservations.flight.arrivalcity}
<br>
dateofDeparture:${reservations.flight.dateofDeparture}
<br>
estimatedDepartureTime:${reservations.flight.estimatedDepartureTime}
<br>

<h2> passenger Details</h2>
First name :${reservations.passenger.firstName}
<br>
lastName :${reservations.passenger.lastName}
<br>
middleName:${reservations.passenger.middleName}
<br>
email:${reservations.passenger.email}
<br>
phone :${reservations.passenger.phone}
<br>

<form action="completReservation">
enter the number of bags  you want to cheak in 
<input type="text" name="numbersOfBags">
<input type="hidden" value="${reservations.id}" name="reservationId">
<input type="submit" value="checkedIn"> 

</form>
</body>
</html>