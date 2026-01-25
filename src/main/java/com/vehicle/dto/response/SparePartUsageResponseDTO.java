package com.vehicle.dto.response;

import java.time.LocalDate;

import com.vehicle.models.SparePart;
import com.vehicle.models.Vehicle;


public class SparePartUsageResponseDTO {

	private Long id;
	
	private Vehicle vehicle;
	
	private SparePart sparePartId;
	
	private Integer usedQuantity;
	
	private LocalDate usedDate;
	
	private String remarks;

	public SparePartUsageResponseDTO(Long id, Vehicle vehicle, SparePart sparePartId, Integer usedQuantity,
			LocalDate usedDate, String remarks) {
		super();
		this.id = id;
		this.vehicle = vehicle;
		this.sparePartId = sparePartId;
		this.usedQuantity = usedQuantity;
		this.usedDate = usedDate;
		this.remarks = remarks;
	}

	public SparePartUsageResponseDTO() {
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
