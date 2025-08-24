package com.sarthak.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sarthak.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {
	PasswordResetToken findByToken(String token);
}
