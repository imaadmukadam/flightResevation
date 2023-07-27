package com.imaad.flight.repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imaad.flight.enitity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long>{

}
