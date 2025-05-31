package com.app.service;


import com.app.shared.UserDTO;

public interface UserService {
	
	UserDTO createUser(UserDTO usersDetails);
	UserDTO getUserDetailsByEmail(String email);

}
