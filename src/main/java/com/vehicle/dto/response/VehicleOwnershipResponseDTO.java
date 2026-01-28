package com.vehicle.dto.response;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.vehicle.enums.OwnershipStatus;

public class VehicleOwnershipResponseDTO {

    private Long id;
    private Long vehicleId;
    private Long customerId;
    private LocalDate ownershipStartDate;
    private LocalDate ownershipEndDate;
    private OwnershipStatus status;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;

    public VehicleOwnershipResponseDTO() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
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
