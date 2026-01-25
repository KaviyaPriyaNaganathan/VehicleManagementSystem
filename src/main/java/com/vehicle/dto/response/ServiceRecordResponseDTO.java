package com.vehicle.dto.response;

import java.time.LocalDate;

import com.vehicle.enums.ServiceStatus;
import com.vehicle.models.User;
import com.vehicle.models.Vehicle;

public class ServiceRecordResponseDTO {

	
	private Long id;

	private Vehicle vehicle;
	
	private User technicianId;
	
	private LocalDate serviceDate;
	
	
	private ServiceStatus status;
	
	private String description;

	private Double serviceCost;

	public ServiceRecordResponseDTO(Long id, Vehicle vehicle, User technicianId, LocalDate serviceDate,
			ServiceStatus status, String description, Double serviceCost) {
		super();
		this.id = id;
		this.vehicle = vehicle;
		this.technicianId = technicianId;
		this.serviceDate = serviceDate;
		this.status = status;
		this.description = description;
		this.serviceCost = serviceCost;
	}

	public ServiceRecordResponseDTO() {
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

	public User getTechnicianId() {
		return technicianId;
	}

	public void setTechnicianId(User technicianId) {
		this.technicianId = technicianId;
	}

	public LocalDate getServiceDate() {
		return serviceDate;
	}

	public void setServiceDate(LocalDate serviceDate) {
		this.serviceDate = serviceDate;
	}

	public ServiceStatus getStatus() {
		return status;
	}

	public void setStatus(ServiceStatus status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getServiceCost() {
		return serviceCost;
	}

	public void setServiceCost(Double serviceCost) {
		this.serviceCost = serviceCost;
	}
	
	
}
