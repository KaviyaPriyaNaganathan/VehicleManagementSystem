package com.vehicle.dto.response;

import java.time.LocalDateTime;


import com.vehicle.enums.UserRole;


public class UserResponseDTO {

	private Long id;
	
	private String username;
	
	private UserRole role;
	
	private Boolean active =true;
	
	private LocalDateTime createdAt;
	
	private LocalDateTime lastLoginAt;

	public UserResponseDTO(Long id, String username, UserRole role, Boolean active,
			LocalDateTime createdAt, LocalDateTime lastLoginAt) {
		super();
		this.id = id;
		this.username = username;
		this.role = role;
		this.active = active;
		this.createdAt = createdAt;
		this.lastLoginAt = lastLoginAt;
	}

	public UserResponseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole role) {
		this.role = role;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getLastLoginAt() {
		return lastLoginAt;
	}

	public void setLastLoginAt(LocalDateTime lastLoginAt) {
		this.lastLoginAt = lastLoginAt;
	}
	
	
	
}
