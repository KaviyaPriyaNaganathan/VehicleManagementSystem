package com.vehicle.dto.request;



import java.math.BigDecimal;
import java.time.LocalDate;

import com.vehicle.enums.ReturnType;

public class ReturnStorageRequestDTO {

    private Long vehicleId;
    private ReturnType returnType;
    private String reason;
    private LocalDate returnDate;
    private String storageLocation;
    private BigDecimal  returnFee;

    private Long paymentId;

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public ReturnType getReturnType() {
        return returnType;
    }

    public void setReturnType(ReturnType returnType) {
        this.returnType = returnType;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public String getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
    }

    public BigDecimal  getReturnFee() {
        return returnFee;
    }

    public void setReturnFee(BigDecimal  returnFee) {
        this.returnFee = returnFee;
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }
}
