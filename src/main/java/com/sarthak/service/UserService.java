package com.sarthak.service;

import com.sarthak.exception.UserException;
import com.sarthak.model.User;

public interface UserService {

	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public User findUserByEmail(String email) throws UserException;


}
