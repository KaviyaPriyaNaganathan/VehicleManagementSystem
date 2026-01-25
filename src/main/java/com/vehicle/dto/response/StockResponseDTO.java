package com.vehicle.dto.response;

import java.time.LocalDate;

import com.vehicle.models.Vehicle;


public class StockResponseDTO {

	private Long id;
	
	private Vehicle vehicle;
	
	private Integer quantity;
	
	private Boolean available;
	
	private String location;
	
	private LocalDate addedDate;

	public StockResponseDTO(Long id, Vehicle vehicle, Integer quantity, Boolean available, String location,
			LocalDate addedDate) {
		super();
		this.id = id;
		this.vehicle = vehicle;
		this.quantity = quantity;
		this.available = available;
		this.location = location;
		this.addedDate = addedDate;
	}

	public StockResponseDTO() {
		super();
		// TODO Auto-generated constructor stub
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
