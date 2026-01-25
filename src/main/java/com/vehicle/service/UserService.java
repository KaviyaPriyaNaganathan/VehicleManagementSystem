package com.vehicle.service;

import org.springframework.stereotype.Service;

import com.vehicle.dto.request.UserRequestDTO;
import com.vehicle.dto.response.UserResponseDTO;


@Service
public interface UserService {

	UserResponseDTO createUser(UserRequestDTO user);



}
