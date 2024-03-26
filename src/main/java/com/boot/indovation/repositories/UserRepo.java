package com.boot.indovation.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.bims.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	Optional<User> findByUserNameAndPassword(String userName, String password);

	
}
