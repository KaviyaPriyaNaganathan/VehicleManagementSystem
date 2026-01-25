package com.vehicle.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="sparePartUsage")
public class SparePartUsage {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "vehicle_id",nullable = false)
	private Vehicle vehicle;
	

	@ManyToOne
	@JoinColumn(name = "spare_part_id", nullable = false)
	private SparePart sparePartId;
	
	@Column(nullable = false)
	private Integer usedQuantity;
	
	@Column(nullable = false)
	private LocalDate usedDate;
	
	@Column(nullable = false, length =1000)
	private String remarks;

	

	public SparePartUsage(Long id, Vehicle vehicle, SparePart sparePartId, Integer usedQuantity, LocalDate usedDate,
			String remarks) {
		super();
		this.id = id;
		this.vehicle = vehicle;
		this.sparePartId = sparePartId;
		this.usedQuantity = usedQuantity;
		this.usedDate = usedDate;
		this.remarks = remarks;
	}

	public SparePartUsage() {
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

	public SparePart getSparePartId() {
		return sparePartId;
	}

	public void setSparePartId(SparePart sparePartId) {
		this.sparePartId = sparePartId;
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
	
	
}
