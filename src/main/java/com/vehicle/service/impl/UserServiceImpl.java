package com.vehicle.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicle.dto.request.UserRequestDTO;
import com.vehicle.dto.response.UserResponseDTO;
import com.vehicle.mapper.UserMapper;
import com.vehicle.models.User;
import com.vehicle.repository.UserRepository;
import com.vehicle.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	private UserRepository userRepository;
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	
	@Override
	public UserResponseDTO createUser(UserRequestDTO user) {
		if(userRepository.existsByUsername(user.getUsername()))
		{
			throw new RuntimeException("User already present.");
		}
		
		
		User EntityUser = UserMapper.toEntity(user);
		
		User savedUser = userRepository.save(EntityUser);
		
		return UserMapper.toResponse(savedUser);
		
	}


	

}
