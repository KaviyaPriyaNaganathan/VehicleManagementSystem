package com.vehicle.dto.response;

import java.time.LocalDate;

import com.vehicle.enums.ReturnType;
import com.vehicle.models.Vehicle;

public class ReturnStorageResponseDTO {

	private Long id;

	private Vehicle vehicle;
	
	private ReturnType returnType;
	
	private String reason;
	
	private LocalDate returnDate;
	
	private String storageLocation;

	public ReturnStorageResponseDTO(Long id, Vehicle vehicle, ReturnType returnType, String reason,
			LocalDate returnDate, String storageLocation) {
		super();
		this.id = id;
		this.vehicle = vehicle;
		this.returnType = returnType;
		this.reason = reason;
		this.returnDate = returnDate;
		this.storageLocation = storageLocation;
	}

	public ReturnStorageResponseDTO() {
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
