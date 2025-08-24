package com.sarthak.service;

import com.sarthak.exception.ProductException;
import com.sarthak.model.Cart;
import com.sarthak.model.CartItem;
import com.sarthak.model.Product;
import com.sarthak.model.User;

public interface CartService {
	
	public CartItem addCartItem(User user,
								Product product,
								String size,
								int quantity) throws ProductException;
	
	public Cart findUserCart(User user);

}
