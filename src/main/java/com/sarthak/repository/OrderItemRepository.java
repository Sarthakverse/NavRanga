package com.sarthak.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sarthak.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
