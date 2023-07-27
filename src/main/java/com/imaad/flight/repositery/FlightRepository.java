package com.imaad.flight.repositery;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.imaad.flight.enitity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long>{
	

	@Query("from Flight where departure=:departure and arrivalcity=:arrivalcity and dateof_departure=:dateof_departure")
	List<Flight> findlFlights(@Param("departure") String from, @Param("arrivalcity") String to, @Param("dateof_departure") String date);
}
 