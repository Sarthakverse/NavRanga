package com.sarthak.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sarthak.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	public User findByEmail(String username);

}
