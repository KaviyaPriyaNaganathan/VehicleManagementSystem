package com.vehicle.models;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.vehicle.enums.OwnershipStatus;

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
@Table(name ="vehicleOwnership")
public class VehicleOwnership {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	

	@ManyToOne
	@JoinColumn(name = "vehicle_id", nullable = false)
	private Vehicle vehicle;
	

	@ManyToOne
	@JoinColumn(name ="customer_id", nullable = false)
	private User customerId;
	
	
	@Column(nullable = false)
	private LocalDate ownershipStartDate;
	
	@Column
	private LocalDate ownershipEndDate;
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private OwnershipStatus status;
	
	@CreationTimestamp
	private LocalDate createdDate;
	
	@UpdateTimestamp
	private LocalDate updatedDate;
	
	
	
	public VehicleOwnership(Long id, Vehicle vehicle, User customerId, LocalDate ownershipStartDate,
			LocalDate ownershipEndDate, OwnershipStatus status, LocalDate createdDate, LocalDate updatedDate) {
		super();
		this.id = id;
		this.vehicle = vehicle;
		this.customerId = customerId;
		this.ownershipStartDate = ownershipStartDate;
		this.ownershipEndDate = ownershipEndDate;
		this.status = status;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}
	public VehicleOwnership() {
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
	public User getCustomerId() {
		return customerId;
	}
	public void setCustomerId(User customerId) {
		this.customerId = customerId;
	}
	public LocalDate getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
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
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	
	
}
