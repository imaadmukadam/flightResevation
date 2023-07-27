package com.imaad.flight.repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imaad.flight.enitity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long>{

}
