package com.BlogProject.services;

import java.util.List;

import com.BlogProject.payload.userDto;

public interface userServices {
	
	userDto createUser(userDto user);
	userDto updateUser(userDto user,int userid);
	userDto getUserById(int userid);
	List<userDto> getAllUser();
	boolean deleteUser(int userid);

}
