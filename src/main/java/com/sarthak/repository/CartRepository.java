package com.sarthak.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sarthak.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {

	 Cart findByUserId(Long userId);
}
