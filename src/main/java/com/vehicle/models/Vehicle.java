package com.vehicle.models;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.vehicle.enums.VehicleStatus;
import com.vehicle.enums.VehicleType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="vehicles")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String brand;

    @Column(nullable = false)
    private String model;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private VehicleType vehicleType;

    @Column(nullable = false, unique = true)
    private String engineNumber;

    @Column(nullable = false, unique = true)
    private String chassisNumber;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private VehicleStatus status;

    @Column
    private LocalDateTime manufactureDate;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @Column(nullable = false)
    private Double purchasePrice;

    // Constructors
    public Vehicle() {}

	public Vehicle(Long id, String brand, String model, VehicleType vehicleType, String engineNumber,
			String chassisNumber, VehicleStatus status, LocalDateTime manufactureDate, LocalDateTime createdAt,
			LocalDateTime updatedAt, Double purchasePrice) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.vehicleType = vehicleType;
		this.engineNumber = engineNumber;
		this.chassisNumber = chassisNumber;
		this.status = status;
		this.manufactureDate = manufactureDate;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.purchasePrice = purchasePrice;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getEngineNumber() {
		return engineNumber;
	}

	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}

	public String getChassisNumber() {
		return chassisNumber;
	}

	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}

	public VehicleStatus getStatus() {
		return status;
	}

	public void setStatus(VehicleStatus status) {
		this.status = status;
	}

	public LocalDateTime getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDateTime manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(Double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

    
  
}
