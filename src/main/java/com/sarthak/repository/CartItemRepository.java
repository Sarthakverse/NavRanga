package com.sarthak.repository;

import com.sarthak.model.Cart;
import com.sarthak.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sarthak.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


    CartItem findByCartAndProductAndSize(Cart cart, Product product, String size);


}
