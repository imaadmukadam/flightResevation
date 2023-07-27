package com.imaad.FlightCheckin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.imaad.FlightCheckin.integration.ReservationClint;
import com.imaad.FlightCheckin.integration.dto.ReservationUpdateRequest;
import com.imaad.FlightCheckin.integration.dto.Reseveration;

@Controller
public class CheckInController {
	@Autowired
	ReservationClint restClint;
	
@RequestMapping("/showStart")
	public String ShowStartCheckin() {
		System.out.println("in show cheakin");
		return "startCheakIn";
	}

@RequestMapping("/checkin")
public String Checkin(@RequestParam("reservationId") Long reservationId, ModelMap modelmap) {
	Reseveration findReveration = restClint.findReveration(reservationId);
	modelmap.addAttribute("reservations", findReveration);
	return "displayReservationDetails";
}
@RequestMapping("/completReservation")
public String completCheackin(@RequestParam("reservationId") Long reservationId, @RequestParam("numbersOfBags") int numbersOfBags) {
	ReservationUpdateRequest ru = new ReservationUpdateRequest();
	ru.setId(reservationId);
	ru.setCheckedIn(true);
	ru.setNumbersOfBags(numbersOfBags);
	restClint.updateReservation(ru);
	
	return "cheackinConformation";
}
}
