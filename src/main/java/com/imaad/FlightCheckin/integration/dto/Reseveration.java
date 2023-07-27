package com.imaad.FlightCheckin.integration.dto;

public class Reseveration {
	private Long id;
	private Boolean checkIn;
	private int numberOfBags;
	private Passenger passenger;
	private Flight flight;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Boolean getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(Boolean checkIn) {
		this.checkIn = checkIn;
	}
	public int getNumberOfBags() {
		return numberOfBags;
	}
	public void setNumberOfBags(int numberOfBags) {
		this.numberOfBags = numberOfBags;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	
	
	

}
