package com.imaad.FlightCheckin.integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.imaad.FlightCheckin.integration.dto.ReservationUpdateRequest;
import com.imaad.FlightCheckin.integration.dto.Reseveration;
@Component
public class ReservationRestClintImpl implements ReservationClint{
	private static final String ReservationRestURL= "http://localhost:8081/flights/reservations/";

	@Override
	public Reseveration findReveration(Long id) {

		RestTemplate restTemplet = new RestTemplate();
		Reseveration reseveration = restTemplet.getForObject(ReservationRestURL+id,Reseveration.class);
		
		return reseveration;
	}

	@Override
	public Reseveration updateReservation(ReservationUpdateRequest request) {
		RestTemplate resttemp = new RestTemplate();
		Reseveration reseveration = resttemp.postForObject(ReservationRestURL, request, Reseveration.class);
		return reseveration;
	}

}
