package com.sarthak.service;


import com.sarthak.exception.WishlistNotFoundException;
import com.sarthak.model.Product;
import com.sarthak.model.User;
import com.sarthak.model.Wishlist;

public interface WishlistService {

    Wishlist createWishlist(User user);

    Wishlist getWishlistByUserId(User user);

    Wishlist addProductToWishlist(User user, Product product) throws WishlistNotFoundException;

}

