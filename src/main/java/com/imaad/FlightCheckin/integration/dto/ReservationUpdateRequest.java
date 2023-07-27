package com.imaad.FlightCheckin.integration.dto;

public class ReservationUpdateRequest {
	
	private Long id;
	private Boolean checkedIn;
	private int numbersOfBags;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Boolean getCheckedIn() {
		return checkedIn;
	}
	public void setCheckedIn(Boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	public int getNumbersOfBags() {
		return numbersOfBags;
	}
	public void setNumbersOfBags(int numbersOfBags) {
		this.numbersOfBags = numbersOfBags;
	}
	

}
