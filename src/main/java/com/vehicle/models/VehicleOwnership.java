package com.vehicle.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

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
@Table(name ="vehicle_ownership")
public class VehicleOwnership {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "vehicle_id", nullable = false)
    private Vehicle vehicle;

    @ManyToOne
    @JoinColumn(name ="customer_id", nullable = false)
    private User customer;

    @Column(nullable = false)
    private LocalDate ownershipStartDate;

    @Column
    private LocalDate ownershipEndDate;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private OwnershipStatus status;

    @CreationTimestamp
    private LocalDateTime createdDate;

    @UpdateTimestamp
    private LocalDateTime updatedDate;

    // Constructors
    public VehicleOwnership() {}

	public VehicleOwnership(Long id, Vehicle vehicle, User customer, LocalDate ownershipStartDate,
			LocalDate ownershipEndDate, OwnershipStatus status, LocalDateTime createdDate, LocalDateTime updatedDate) {
		super();
		this.id = id;
		this.vehicle = vehicle;
		this.customer = customer;
		this.ownershipStartDate = ownershipStartDate;
		this.ownershipEndDate = ownershipEndDate;
		this.status = status;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
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

	public User getCustomer() {
		return customer;
	}

	public void setCustomer(User customer) {
		this.customer = customer;
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

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

    
   
}
