package com.imaad.FlightCheckin.integration;
import com.imaad.FlightCheckin.integration.dto.*;
public interface ReservationClint {
	public Reseveration findReveration(Long id);
	public Reseveration updateReservation(ReservationUpdateRequest request);
}
