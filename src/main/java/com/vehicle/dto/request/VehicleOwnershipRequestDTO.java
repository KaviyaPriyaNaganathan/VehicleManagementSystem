package com.vehicle.dto.request;



import java.time.LocalDate;

import com.vehicle.enums.OwnershipStatus;

public class VehicleOwnershipRequestDTO {

    private Long vehicleId;
    private Long customerId;
    private LocalDate ownershipStartDate;
    private LocalDate ownershipEndDate;
    private OwnershipStatus status;

    public VehicleOwnershipRequestDTO() {}

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
}
