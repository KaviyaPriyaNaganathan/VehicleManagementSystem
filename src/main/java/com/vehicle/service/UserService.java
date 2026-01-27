package com.vehicle.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vehicle.dto.request.UserRequestDTO;
import com.vehicle.dto.response.UserResponseDTO;


@Service
public interface UserService {

	UserResponseDTO createUser(UserRequestDTO user);

	List<UserResponseDTO> getAllUsers();

	UserResponseDTO getUserById(Long id);

	UserResponseDTO deactivateUser(Long id);



}
