package com.vehicle.models;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name = "spare_part_usage")
public class SparePartUsage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "vehicle_id", nullable = false)
    private Vehicle vehicle;

    @ManyToOne
    @JoinColumn(name = "spare_part_id", nullable = false)
    private SparePart sparePart;

    @Column(nullable = false)
    private Integer usedQuantity;

    @Column(nullable = false)
    private LocalDate usedDate;

    @Column(nullable = false, length = 1000)
    private String remarks;

    @Column(nullable = false, precision = 12, scale = 2)
    private BigDecimal unitPrice;

    @Column(nullable = false, precision = 14, scale = 2)
    private BigDecimal totalPrice;

    public SparePartUsage() {}


    @PrePersist
    private void calculatePrices() 
    {
        if (sparePart != null && sparePart.getPrice() != null && usedQuantity != null) 
        {
            this.unitPrice = sparePart.getPrice();
            this.totalPrice = this.unitPrice.multiply(BigDecimal.valueOf(usedQuantity));
        }
    }


	public SparePartUsage(Long id, Vehicle vehicle, SparePart sparePart, Integer usedQuantity, LocalDate usedDate,
			String remarks, BigDecimal unitPrice, BigDecimal totalPrice) {
		super();
		this.id = id;
		this.vehicle = vehicle;
		this.sparePart = sparePart;
		this.usedQuantity = usedQuantity;
		this.usedDate = usedDate;
		this.remarks = remarks;
		this.unitPrice = unitPrice;
		this.totalPrice = totalPrice;
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


	public SparePart getSparePart() {
		return sparePart;
	}


	public void setSparePart(SparePart sparePart) {
		this.sparePart = sparePart;
	}


	public Integer getUsedQuantity() {
		return usedQuantity;
	}


	public void setUsedQuantity(Integer usedQuantity) {
		this.usedQuantity = usedQuantity;
	}


	public LocalDate getUsedDate() {
		return usedDate;
	}


	public void setUsedDate(LocalDate usedDate) {
		this.usedDate = usedDate;
	}


	public String getRemarks() {
		return remarks;
	}


	public void setRemarks(String remarks) {
		this.remarks = remarks;
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

	
	
}
