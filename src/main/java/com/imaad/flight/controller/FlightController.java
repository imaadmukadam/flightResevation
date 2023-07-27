package com.imaad.flight.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.imaad.flight.enitity.Flight;
import com.imaad.flight.repositery.FlightRepository;

@Controller
public class FlightController {
	@Autowired
	FlightRepository flightrepo;
	@RequestMapping("/findFlights")
public String findflight(@RequestParam("form") String from , @RequestParam("to") String to,@RequestParam("departureDate") String date, ModelMap modelmap) {
		System.out.println(from);
		System.out.println(to);
		System.out.println(date);
		List<Flight> findlFlights = flightrepo.findlFlights(from, to, date);
		System.out.println(findlFlights);
		modelmap.addAttribute("flights",findlFlights);
		
	return "flight/displayflights";
	
}
	
	

}
