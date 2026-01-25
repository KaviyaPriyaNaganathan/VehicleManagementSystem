package com.vehicle.dto.request;

import com.vehicle.enums.VehicleStatus;
import com.vehicle.enums.VehicleType;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class VehicleRequestDTO {

	private Long id;
	private String brand;
	
	private String model;

	private VehicleType vehicleType;
	
	private String engineNumber;
	
	private String chassisNumber;
	
	private VehicleStatus status;

	public VehicleRequestDTO(Long id,String brand, String model, VehicleType vehicleType, String engineNumber,
			String chassisNumber, VehicleStatus status) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.vehicleType = vehicleType;
		this.engineNumber = engineNumber;
		this.chassisNumber = chassisNumber;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public VehicleRequestDTO() {
		super();
		// TODO Auto-generated constructor stub
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
	
	
}
