package com.vehicle.dto.request;


import java.time.LocalDateTime;

import com.vehicle.enums.VehicleStatus;
import com.vehicle.enums.VehicleType;

public class VehicleRequestDTO {

    private String brand;
    private String model;
    private VehicleType vehicleType;
    private String engineNumber;
    private String chassisNumber;
    private VehicleStatus status;
    private LocalDateTime manufactureDate;
    private Double purchasePrice;

    public VehicleRequestDTO() {}

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

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
}
