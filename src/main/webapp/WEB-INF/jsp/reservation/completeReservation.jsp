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
<h1>complete your reveration details</h1>
Airlines:${flight.operatingAirlines}
<br>
departure:${flight.departure}
<br>
Arrival:${flight.arrivalcity}
<br>
<form action="completReveration">
First Name:<input type="text" name="passengerFirstName">
<br>
Last Name :<input type="text" name="passengerLastName">
<br>
Middle Name:<input type="text" name="passengerLastName">
<br>
Email     :<input type="text" name="passengerEmail">
<br>
Phone no  :<input type="text" name="passengerPhone">
<br>
<h2>card details</h2>
Name on the Card:<input type="text" name="nameOnTheCard">
<br>
Card No         :<input type="text" name="cardNumber">
<br>
Expiry Date     :<input type="text" name="expiryDate">
<br>
Three dight pin :<input type="text" name="securityCode">
<br>
<input type="hidden" name="flightId" value="${flight.id}">
<input type="submit" value="confirm">
</form>

</body>
</html>