package com.vehicle.service.impl;

import java.util.List;

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


	@Override
	public List<UserResponseDTO> getAllUsers() {
		// TODO Auto-generated method stub
		
		return userRepository.findAll()
				.stream()
				.map(UserMapper::toResponse)
				.toList();
	}


	@Override
	public UserResponseDTO getUserById(Long id) {
		// TODO Auto-generated method stub
		
		User user = userRepository.findById(id).orElseThrow(()->new RuntimeException("User not found with id "+id));
		
		return UserMapper.toResponse(user);
	}


	@Override
	public UserResponseDTO deactivateUser(Long id) {
		// TODO Auto-generated method stub
		User user = userRepository.findById(id).orElseThrow(()->new RuntimeException("User not found with id "+id));
		
		user.setActive(false);
		
		User savedUser = userRepository.save(user);
		
		
		
		return UserMapper.toResponse(savedUser);
	}


	

}
