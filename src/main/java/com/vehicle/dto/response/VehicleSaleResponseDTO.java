package com.vehicle.dto.response;

import java.time.LocalDate;

public class VehicleSaleResponseDTO {

	  private Long id;
	    private Long vehicleId;
	    private Integer quantity;
	    private LocalDate saleDate;
	    private Long paymentId;
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
		public LocalDate getSaleDate() {
			return saleDate;
		}
		public void setSaleDate(LocalDate saleDate) {
			this.saleDate = saleDate;
		}
		public Long getPaymentId() {
			return paymentId;
		}
		public void setPaymentId(Long paymentId) {
			this.paymentId = paymentId;
		}
	    
	    
	
}
