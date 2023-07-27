package com.imaad.flight.service;

import com.imaad.flight.dto.ReservationRequest;
import com.imaad.flight.enitity.Reservation;

public interface ReservationService {
	public Reservation bookFlight(ReservationRequest request);

}
