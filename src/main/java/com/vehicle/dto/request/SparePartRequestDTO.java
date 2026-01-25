package com.vehicle.dto.request;

import com.vehicle.enums.SparePartStatus;


public class SparePartRequestDTO {

	private Long id;
	
private String partName;
	
	private String partCode;
	
	private String category;
	
	private Integer quantity;
	
	private Double price;

	private SparePartStatus status;

	public SparePartRequestDTO(Long id, String partName, String partCode, String category, Integer quantity, Double price,
			SparePartStatus status) {
		super();
		this.id = id;
		this.partName = partName;
		this.partCode = partCode;
		this.category = category;
		this.quantity = quantity;
		this.price = price;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public SparePartRequestDTO() {
		super();
		// TODO Auto-generated constructor stub
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
	
	
}
