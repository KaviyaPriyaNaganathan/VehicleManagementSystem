package com.vehicle.dto.request;

import java.time.LocalDate;

import com.vehicle.enums.OwnershipStatus;
import com.vehicle.models.User;
import com.vehicle.models.Vehicle;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class VehicleOwnershipRequestDTO {

	private Vehicle vehicle;
	
	private User customerId;
	
	private LocalDate ownershipStartDate;
	
	private LocalDate ownershipEndDate;
	
	private OwnershipStatus status;

	public VehicleOwnershipRequestDTO(Vehicle vehicle, User customerId, LocalDate ownershipStartDate,
			LocalDate ownershipEndDate, OwnershipStatus status) {
		super();
		this.vehicle = vehicle;
		this.customerId = customerId;
		this.ownershipStartDate = ownershipStartDate;
		this.ownershipEndDate = ownershipEndDate;
		this.status = status;
	}

	public VehicleOwnershipRequestDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public User getCustomerId() {
		return customerId;
	}

	public void setCustomerId(User customerId) {
		this.customerId = customerId;
	}

	public LocalDate getOwnershipStartDate() {
		return ownershipStartDate;
	}

	public void setOwnershipStartDate(LocalDate ownershipStartDate) {
		this.ownershipStartDate = ownershipStartDate;
	}

	public LocalDate getOwnershipEndDate() {
		return ownershipEndDate;
	}

	public void setOwnershipEndDate(LocalDate ownershipEndDate) {
		this.ownershipEndDate = ownershipEndDate;
	}

	public OwnershipStatus getStatus() {
		return status;
	}

	public void setStatus(OwnershipStatus status) {
		this.status = status;
	}
	
}
