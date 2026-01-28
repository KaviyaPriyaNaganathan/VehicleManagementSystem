package com.vehicle.models;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import com.vehicle.enums.PaymentStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;

@Entity
@Table(name ="stock")
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}

	@ManyToOne
    @JoinColumn(name = "vehicle_id", nullable = false)
    private Vehicle vehicle;

    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false)
    private Boolean available;

    @Column(nullable = false)
    private String location;

    @CreationTimestamp
    private LocalDate addedDate;

    @Column(nullable = false)
    private BigDecimal  unitPrice; 

    @Column(nullable = false)
    private BigDecimal  totalPrice;

    @Column(length = 10)
    private String currency;

    @Enumerated(EnumType.STRING)
    @Column(length = 10)
    private PaymentStatus paymentStatus; 

    private LocalDate lastPaymentDate;

    @PrePersist
    @PreUpdate
    private void calculateDerivedFields() {
        if (unitPrice != null && quantity != null) {
            this.totalPrice = unitPrice.multiply(BigDecimal.valueOf(quantity));
        }
        this.available = (quantity != null && quantity > 0);
    }


	public Stock(Long id, Vehicle vehicle, Integer quantity, Boolean available, String location, LocalDate addedDate,
			BigDecimal  unitPrice, BigDecimal  totalPrice, String currency, PaymentStatus paymentStatus,
			LocalDate lastPaymentDate) {
		super();
		this.id = id;
		this.vehicle = vehicle;
		this.quantity = quantity;
		this.available = available;
		this.location = location;
		this.addedDate = addedDate;
		this.unitPrice = unitPrice;
		this.totalPrice = totalPrice;
		this.currency = currency;
		this.paymentStatus = paymentStatus;
		this.lastPaymentDate = lastPaymentDate;
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

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Boolean getAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public LocalDate getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(LocalDate addedDate) {
		this.addedDate = addedDate;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public LocalDate getLastPaymentDate() {
		return lastPaymentDate;
	}

	public void setLastPaymentDate(LocalDate lastPaymentDate) {
		this.lastPaymentDate = lastPaymentDate;
	}

}
