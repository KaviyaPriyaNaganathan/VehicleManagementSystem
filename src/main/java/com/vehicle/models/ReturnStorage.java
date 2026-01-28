package com.vehicle.models;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.vehicle.enums.ReturnType;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "return_storage")
public class ReturnStorage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "vehicle_id", nullable = false)
    private Vehicle vehicle;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ReturnType returnType;

    @Column(nullable = false, length = 1000)
    private String reason;

    @Column(nullable = false)
    private LocalDate returnDate;

    @Column(nullable = false, length = 255)
    private String storageLocation;

    @Column(nullable = false, precision = 12, scale = 2)
    private BigDecimal returnFee; 

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "payment_id")
    private Payment payment;

    public ReturnStorage() {
    }

    public ReturnStorage(Long id, Vehicle vehicle, ReturnType returnType, String reason, LocalDate returnDate,
                         String storageLocation, BigDecimal returnFee, Payment payment) {
        super();
        this.id = id;
        this.vehicle = vehicle;
        this.returnType = returnType;
        this.reason = reason;
        this.returnDate = returnDate;
        this.storageLocation = storageLocation;
        this.returnFee = returnFee;
        this.payment = payment;
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

    public BigDecimal getReturnFee() {
        return returnFee;
    }

    public void setReturnFee(BigDecimal returnFee) {
        this.returnFee = returnFee;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
