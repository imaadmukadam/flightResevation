package com.imaad.flight.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imaad.flight.dto.ReservationUpdateRequest;
import com.imaad.flight.enitity.Reservation;
import com.imaad.flight.repositery.ReservationRepository;

@RestController
@CrossOrigin
public class ReservationRestController {
	@Autowired
	ReservationRepository reservationRepository;
	
	@RequestMapping("/reservations/{id}")
	public Reservation findReservation(@PathVariable("id") Long id) {
		return reservationRepository.findById(id).get();	
	}
	@RequestMapping("/reservations")
	public Reservation UpdateReservation(@RequestBody ReservationUpdateRequest request) {
	Reservation reservation = reservationRepository.findById(request.getId()).get();
	reservation.setNumberOfBags(request.getNumbersOfBags());
	reservation.setCheakedIn(request.isCheckIn());
		return reservationRepository.save(reservation);
	}

}
