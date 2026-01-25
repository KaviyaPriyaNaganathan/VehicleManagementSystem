package com.vehicle.models;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import com.vehicle.enums.SparePartStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="sparePart")
public class SparePart {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String partName;
	
	@Column(nullable = false, unique = true)
	private String partCode;
	
	@Column(nullable = false)
	private String category;
	
	@Column(nullable = false)
	private Integer quantity;
	
	@Column(nullable = false)
	private Double price;
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private SparePartStatus status;
	
	@CreationTimestamp
	private LocalDate createdAt;
	
	
	public SparePart(Long id, String partName, String partCode, String category, Integer quantity, Double price,
			SparePartStatus status, LocalDate createdAt) {
		super();
		this.id = id;
		this.partName = partName;
		this.partCode = partCode;
		this.category = category;
		this.quantity = quantity;
		this.price = price;
		this.status = status;
		this.createdAt = createdAt;
	}
	public SparePart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPartName() {
		return partName;
	}
	public void setPartName(String partName) {
		this.partName = partName;
	}
	public String getPartCode() {
		return partCode;
	}
	public void setPartCode(String partCode) {
		this.partCode = partCode;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public SparePartStatus getStatus() {
		return status;
	}
	public void setStatus(SparePartStatus status) {
		this.status = status;
	}
	public LocalDate getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}
	
	
}
