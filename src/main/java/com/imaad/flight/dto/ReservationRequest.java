package com.imaad.flight.dto;

public class ReservationRequest {
	
	private Long flightId;
	private String passengerFirstName;
	private String passengerLastName;
	private String passengerMiddleName;
	public String getPassengerMiddleName() {
		return passengerMiddleName;
	}
	public void setPassengerMiddleName(String passengerMiddleName) {
		this.passengerMiddleName = passengerMiddleName;
	}
	private String passengerEmail;
	private String passengerPhone;
	private String nameOnTheCard;
	private String cardNumber;
	private String expiryDate;
	private String securityCode;
	public Long getFlightId() {
		return flightId;
	}
	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}
	public String getPassengerFirstName() {
		return passengerFirstName;
	}
	public void setPassengerFirstName(String passengerFirstName) {
		this.passengerFirstName = passengerFirstName;
	}
	public String getPassengerLastName() {
		return passengerLastName;
	}
	public void setPassengerLastName(String passengerLastName) {
		this.passengerLastName = passengerLastName;
	}
	public String getPassengerEmail() {
		return passengerEmail;
	}
	public void setPassengerEmail(String passengerEmail) {
		this.passengerEmail = passengerEmail;
	}
	public String getPassengerPhone() {
		return passengerPhone;
	}
	public void setPassengerPhone(String passengerPhone) {
		this.passengerPhone = passengerPhone;
	}
	public String getNameOnTheCard() {
		return nameOnTheCard;
	}
	public void setNameOnTheCard(String nameOnTheCard) {
		this.nameOnTheCard = nameOnTheCard;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getSecurityCode() {
		return securityCode;
	}
	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}
	public ReservationRequest(Long flightId, String passengerFirstName, String passengerLastName,
			String passengerMiddleName, String passengerEmail, String passengerPhone, String nameOnTheCard,
			String cardNumber, String expiryDate, String securityCode) {
		super();
		this.flightId = flightId;
		this.passengerFirstName = passengerFirstName;
		this.passengerLastName = passengerLastName;
		this.passengerMiddleName = passengerMiddleName;
		this.passengerEmail = passengerEmail;
		this.passengerPhone = passengerPhone;
		this.nameOnTheCard = nameOnTheCard;
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
		this.securityCode = securityCode;
	}
	public ReservationRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ReservationRequest [flightId=" + flightId + ", passengerFirstName=" + passengerFirstName
				+ ", passengerLastName=" + passengerLastName + ", passengerMiddleName=" + passengerMiddleName
				+ ", passengerEmail=" + passengerEmail + ", passengerPhone=" + passengerPhone + ", nameOnTheCard="
				+ nameOnTheCard + ", cardNumber=" + cardNumber + ", expiryDate=" + expiryDate + ", securityCode="
				+ securityCode + "]";
	}
	
	
	
}
