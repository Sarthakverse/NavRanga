package com.sarthak.service;

import com.sarthak.exception.SellerException;
import com.sarthak.exception.UserException;
import com.sarthak.request.LoginRequest;
import com.sarthak.request.SignupRequest;
import com.sarthak.response.AuthResponse;
import jakarta.mail.MessagingException;

public interface AuthService {

    void sentLoginOtp(String email) throws UserException, MessagingException;
    String createUser(SignupRequest req) throws SellerException;
    AuthResponse signin(LoginRequest req) throws SellerException;

}
