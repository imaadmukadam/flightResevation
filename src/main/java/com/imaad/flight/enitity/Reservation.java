package com.imaad.flight.enitity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Reservation extends AbstractEntity {

	private boolean cheakedIn;
	private int numberOfBags;
	@OneToOne
	private Passenger passenger;
	@OneToOne
	private Flight flight;
	public boolean isCheakedIn() {
		return cheakedIn;
	}
	public void setCheakedIn(boolean cheakedIn) {
		this.cheakedIn = cheakedIn;
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
