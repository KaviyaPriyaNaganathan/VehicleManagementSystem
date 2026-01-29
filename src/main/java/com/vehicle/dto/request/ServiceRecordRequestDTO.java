package com.vehicle.dto.request;


import java.math.BigDecimal;
import java.time.LocalDate;

import com.vehicle.enums.ServiceStatus;

public class ServiceRecordRequestDTO {

    private Long vehicleId;
    private Long userId;     
    private Long technicianId;
    private LocalDate serviceDate;
    private ServiceStatus status;
    private String description;
    private BigDecimal serviceCost;
    private String currency;

    public ServiceRecordRequestDTO() {}

    public Long getVehicleId() {
        return vehicleId;
    }

    public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Long getTechnicianId() {
        return technicianId;
    }

    public void setTechnicianId(Long technicianId) {
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

    public BigDecimal getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(BigDecimal serviceCost) {
        this.serviceCost = serviceCost;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
