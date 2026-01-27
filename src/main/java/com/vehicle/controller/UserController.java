package com.vehicle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle.dto.request.UserRequestDTO;
import com.vehicle.dto.response.UserResponseDTO;
import com.vehicle.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {


	private UserService userService;

	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@PostMapping
	public ResponseEntity<UserResponseDTO> createUser(@RequestBody UserRequestDTO user)
	{
		return ResponseEntity.ok(userService.createUser(user));
	}
	
	@GetMapping
	public List<UserResponseDTO> getAllUsers()
	{
		return userService.getAllUsers();
	}
	
	@GetMapping("/{id}")
	public UserResponseDTO getUserById(@PathVariable Long id)
	{
		return userService.getUserById(id);
	}
	
	@PutMapping("/deactivate/{id}")
	public UserResponseDTO deactivateUser(@PathVariable Long id)
	{
		return userService.deactivateUser(id);
	}
}
