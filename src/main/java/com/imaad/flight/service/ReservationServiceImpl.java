package com.imaad.flight.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.imaad.*;
import org.springframework.stereotype.Service;

import com.imaad.flight.dto.ReservationRequest;
import com.imaad.flight.enitity.Flight;
import com.imaad.flight.enitity.Passenger;
import com.imaad.flight.enitity.Reservation;
import com.imaad.flight.repositery.FlightRepository;
import com.imaad.flight.repositery.PassengerRepository;
import com.imaad.flight.repositery.ReservationRepository;
import com.imaad.flight.util.EmailUtil;
import com.imaad.flight.util.PdfGenerator;
@Service
public class ReservationServiceImpl implements ReservationService{

	@Autowired
	FlightRepository flightRepo;
	@Autowired
	PassengerRepository passengerRepo;
	@Autowired
	ReservationRepository reservationRepo;
	@Autowired
	PdfGenerator pdfGenerator;
	@Autowired
	EmailUtil emailutil;
	
	@Override
	public Reservation bookFlight(ReservationRequest request) {
		Long flightId=request.getFlightId();
		Flight flight= flightRepo.findById(flightId).get();
		
		Passenger passenger = new Passenger();
		passenger.setFirstName(request.getPassengerFirstName());
		passenger.setLastName(request.getPassengerLastName());
		passenger.setPhone(request.getPassengerPhone());
		passenger.setEmail(request.getPassengerEmail());
		passenger.setMiddleName(request.getPassengerMiddleName());
		Passenger savePassenger = passengerRepo.save(passenger);
		
		Reservation r = new Reservation();
		r.setFlight(flight);
		r.setPassenger(savePassenger);
		r.setCheakedIn(false);
		Reservation saveReservation = reservationRepo.save(r);
		
		String filePath= "E:/"+saveReservation.getId()+".pdf";
		pdfGenerator.GenerateItinerary(saveReservation, filePath);
		emailutil.sendItinerary(passenger.getEmail(), filePath);
		
		
		return saveReservation;
	}

}
