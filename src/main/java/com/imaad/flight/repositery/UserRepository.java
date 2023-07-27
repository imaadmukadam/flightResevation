package com.imaad.flight.repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imaad.flight.enitity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);

}
