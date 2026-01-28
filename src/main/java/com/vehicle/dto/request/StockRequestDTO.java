package com.vehicle.dto.request;

public class StockRequestDTO {

	private Long id;
    private Long vehicleId;
    private Integer quantity;
    private Boolean available;
    private String location;

    public StockRequestDTO() {
        super();
    }

    public StockRequestDTO(Long id, Long vehicleId, Integer quantity, Boolean available, String location) {
        this.vehicleId = vehicleId;
        this.quantity = quantity;
        this.available = available;
        this.location = location;
        this.id = id;
    }

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
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
}
