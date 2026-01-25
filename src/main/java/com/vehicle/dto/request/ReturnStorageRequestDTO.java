package com.vehicle.dto.request;

import java.time.LocalDate;

import com.vehicle.enums.ReturnType;
import com.vehicle.models.Vehicle;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class ReturnStorageRequestDTO {

	private Vehicle vehicle;
	
	private ReturnType returnType;
	
	private String reason;
	
	private LocalDate returnDate;
	
	private String storageLocation;

	public ReturnStorageRequestDTO(Vehicle vehicle, ReturnType returnType, String reason, LocalDate returnDate,
			String storageLocation) {
		super();
		this.vehicle = vehicle;
		this.returnType = returnType;
		this.reason = reason;
		this.returnDate = returnDate;
		this.storageLocation = storageLocation;
	}

	public ReturnStorageRequestDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public ReturnType getReturnType() {
		return returnType;
	}

	public void setReturnType(ReturnType returnType) {
		this.returnType = returnType;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public LocalDate getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}

	public String getStorageLocation() {
		return storageLocation;
	}

	public void setStorageLocation(String storageLocation) {
		this.storageLocation = storageLocation;
	}
	
	
}
