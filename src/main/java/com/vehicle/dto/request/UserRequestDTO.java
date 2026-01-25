package com.vehicle.dto.request;

import com.vehicle.enums.UserRole;


public class UserRequestDTO {

	private String username;
	
	private String password;

	private UserRole role;
	
	private Boolean active =true;

	public UserRequestDTO(String username, String password, UserRole role, Boolean active) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
		this.active = active;
	}

	public UserRequestDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
	
	
}

