package com.vehicle.models;

import java.time.LocalDate;

import com.vehicle.enums.ReturnType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="return_storage")
public class ReturnStorage {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "vehicle_id", nullable = false)
	private Vehicle vehicle;
	
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private ReturnType returnType;
	
	@Column(nullable = false, length = 1000)
	private String reason;
	
	@Column(nullable = false)
	private LocalDate returnDate;
	
	@Column(nullable = false)
	private String storageLocation;
	public ReturnStorage(Long id, Vehicle vehicle, ReturnType returnType, String reason, LocalDate returnDate,
			String storageLocation) {
		super();
		this.id = id;
		this.vehicle = vehicle;
		this.returnType = returnType;
		this.reason = reason;
		this.returnDate = returnDate;
		this.storageLocation = storageLocation;
	}
	public ReturnStorage() {
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
