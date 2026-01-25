package com.vehicle.models;

import java.time.LocalDate;

import com.vehicle.enums.ServiceStatus;

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
@Table(name ="service_records")
public class ServiceRecord {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	

	@ManyToOne
	@JoinColumn(name = "vehicle_id", nullable = false)
	private Vehicle vehicle;
	
	@ManyToOne
	@JoinColumn(name = "techinician_id", nullable = false)
	private User technicianId;
	
	@Column(nullable = false)
	private LocalDate serviceDate;
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private ServiceStatus status;
	
	@Column(nullable = false, length = 1000)
	private String description;
	
	@Column(nullable = false)
	private Double serviceCost;

	
	public ServiceRecord(Long id, Vehicle vehicle, User technicianId, LocalDate serviceDate, ServiceStatus status,
			String description, Double serviceCost) {
		super();
		this.id = id;
		this.vehicle = vehicle;
		this.technicianId = technicianId;
		this.serviceDate = serviceDate;
		this.status = status;
		this.description = description;
		this.serviceCost = serviceCost;
	}

	public ServiceRecord() {
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
