package com.BlogProject.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.BlogProject.entities.user;
import com.BlogProject.payload.userDto;
import com.BlogProject.repositories.userRepo;
import com.BlogProject.services.userServices;

public class userServiceImpl implements userServices {

	@Autowired
	private userRepo userrepo;
	
	@Override
	public userDto createUser(userDto user) {
		
		user User = this.dtoToUser(user);
		user savedUser = this.userrepo.save(User);
		
		return this.userToDto(savedUser);
	}

	@Override
	public userDto updateUser(userDto user, int userid) {
		return null;
	}

	@Override
	public userDto getUserById(int userid) {
		return null;
	}

	@Override
	public List<userDto> getAllUser() {
		return null;
	}

	@Override
	public boolean deleteUser(int userid) {
		return false;
	}
	
	private user dtoToUser(userDto userDto) {
		
		user User=new user();
		
		User.setId(userDto.getId());
		User.setName(userDto.getName());
		User.setEmail(userDto.getEmail());
		User.setPass(userDto.getPass());
		User.setAbout(userDto.getAbout());
		
		return User;
		
	}
	
	public userDto userToDto(user user) {
		
		userDto Userdto = new userDto();
		
		Userdto.setId(user.getId());
		Userdto.setName(user.getName());
		Userdto.setEmail(user.getEmail());
		Userdto.setPass(user.getPass());
		Userdto.setAbout(user.getAbout());
		
		return Userdto;
	}

}
