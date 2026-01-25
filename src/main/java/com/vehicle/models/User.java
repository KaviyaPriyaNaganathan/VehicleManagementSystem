package com.vehicle.models;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.vehicle.enums.UserRole;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="users")
public class User {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String username;
	
	@Column(nullable = false)
	private String pasword;
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private UserRole role;
	
	@Column(nullable = false)
	private Boolean active =true;
	
	@Column(nullable = false)
	@CreationTimestamp
	private LocalDateTime createdAt;
	
	@Column(nullable = false)
	@UpdateTimestamp
	private LocalDateTime lastLoginAt;
	
	
	public User(Long id, String username, String pasword, UserRole role, boolean active, LocalDateTime createdAt,
			LocalDateTime lastLoginAt) {
		super();
		this.id = id;
		this.username = username;
		this.pasword = pasword;
		this.role = role;
		this.active = active;
		this.createdAt = createdAt;
		this.lastLoginAt = lastLoginAt;
	}


	public User() {
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


	public String getPasword() {
		return pasword;
	}


	public void setPasword(String pasword) {
		this.pasword = pasword;
	}


	public UserRole getRole() {
		return role;
	}


	public void setRole(UserRole role) {
		this.role = role;
	}


	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
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
