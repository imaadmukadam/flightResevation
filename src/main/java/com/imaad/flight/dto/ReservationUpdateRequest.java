package com.imaad.flight.dto;

public class ReservationUpdateRequest {
	private Long id;
	private boolean checkIn;
	private int numbersOfBags;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public boolean isCheckIn() {
		return checkIn;
	}
	public void setCheckIn(boolean checkIn) {
		this.checkIn = checkIn;
	}
	public int getNumbersOfBags() {
		return numbersOfBags;
	}
	public void setNumbersOfBags(int numbersOfBags) {
		this.numbersOfBags = numbersOfBags;
	}
	

}
