package com.imaad.FlightCheckin.integration.dto;

public class Flight {
	private Long id;
	private String flightNumber;
	private String operatingAirlines;
	private String departure;
	private String arrivalcity;
	private String dateofDeparture;
	private String estimatedDepartureTime;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getOperatingAirlines() {
		return operatingAirlines;
	}
	public void setOperatingAirlines(String operatingAirlines) {
		this.operatingAirlines = operatingAirlines;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getArrivalcity() {
		return arrivalcity;
	}
	public void setArrivalcity(String arrivalcity) {
		this.arrivalcity = arrivalcity;
	}
	public String getDateofDeparture() {
		return dateofDeparture;
	}
	public void setDateofDeparture(String dateofDeparture) {
		this.dateofDeparture = dateofDeparture;
	}
	public String getEstimatedDepartureTime() {
		return estimatedDepartureTime;
	}
	public void setEstimatedDepartureTime(String estimatedDepartureTime) {
		this.estimatedDepartureTime = estimatedDepartureTime;
	}

}
