package com.vehicle.mapper;

import com.vehicle.dto.request.UserRequestDTO;
import com.vehicle.dto.response.UserResponseDTO;
import com.vehicle.models.User;

public class UserMapper {

	public User toEntity(UserRequestDTO dto)
	{
		User user = new User();
		user.setUsername(dto.getUsername());
		user.setPasword(dto.getPassword());
		user.setRole(dto.getRole());
		
		return user;
	}
	
	public UserResponseDTO toResponse(User dto)
	{
		UserResponseDTO response = new UserResponseDTO();
		response.setUsername(dto.getUsername());
		response.setRole(dto.getRole());
		response.setCreatedAt(dto.getCreatedAt());
		response.setRole(dto.getRole());
		response.setActive(dto.isActive());
		response.setCreatedAt(dto.getCreatedAt());
		response.setLastLoginAt(dto.getLastLoginAt());
		
		return response;
	}
}
