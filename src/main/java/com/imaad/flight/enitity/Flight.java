package com.imaad.flight.enitity;

import java.security.Timestamp;
import java.sql.Date;

import javax.persistence.Entity;
@Entity
public class Flight extends AbstractEntity {

	private String flightNumber;
	private String operatingAirlines;
	private String departure;
	private String arrivalcity;
	private String dateofDeparture;
	private String estimatedDepartureTime;
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
