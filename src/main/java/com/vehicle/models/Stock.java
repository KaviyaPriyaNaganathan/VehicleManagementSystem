package com.vehicle.models;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="stock")
public class Stock {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	@JoinColumn(name = "vehicle_id", nullable = false)
	private Vehicle vehicle;
	
	@Column(nullable = false)
	private Integer quantity;
	
	@Column(nullable = false)
	private Boolean available;
	
	@Column(nullable = false)
	private String location;
	
	@CreationTimestamp
	private LocalDate addedDate;

	
	
	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Stock(Long id, Vehicle vehicle, Integer quantity, Boolean available, String location, LocalDate addedDate) {
		super();
		this.id = id;
		this.vehicle = vehicle;
		this.quantity = quantity;
		this.available = available;
		this.location = location;
		this.addedDate = addedDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Boolean getAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public LocalDate getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(LocalDate addedDate) {
		this.addedDate = addedDate;
	}

	
	
}
