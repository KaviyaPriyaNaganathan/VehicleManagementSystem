package com.vehicle.dto.request;

import java.time.LocalDate;

public class VehicleSaleRequestDTO {

	 private Long vehicleId;
	    private Integer quantity;
	    private Long paymentId;
	    private LocalDate saleDate;
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
		public Long getPaymentId() {
			return paymentId;
		}
		public void setPaymentId(Long paymentId) {
			this.paymentId = paymentId;
		}
		public LocalDate getSaleDate() {
			return saleDate;
		}
		public void setSaleDate(LocalDate saleDate) {
			this.saleDate = saleDate;
		}
	
	    
	    
}
