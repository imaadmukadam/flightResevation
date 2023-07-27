 package com.imaad.flight.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.imaad.flight.dto.ReservationRequest;
import com.imaad.flight.enitity.Flight;
import com.imaad.flight.enitity.Reservation;
import com.imaad.flight.repositery.FlightRepository;
import com.imaad.flight.repositery.ReservationRepository;
import com.imaad.flight.service.ReservationService;

@Controller
public class ReservationController {
	@Autowired
	ReservationService reservationService;
	@Autowired
	FlightRepository flightRepo;
	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId") Long flightId, ModelMap modelmap) {
		Flight flight = flightRepo.findById(flightId).get();
		modelmap.addAttribute("flight", flight);
		return "reservation/completeReservation";
	}

	@RequestMapping("/completReveration")
	public String completeReservation( ReservationRequest request , ModelMap modelmap) {
	Reservation reservation = reservationService.bookFlight(request);
	modelmap.addAttribute("msg","reservation completed"+ reservation.getId());
	return"reservation/reservationConfromation";
	}
}
