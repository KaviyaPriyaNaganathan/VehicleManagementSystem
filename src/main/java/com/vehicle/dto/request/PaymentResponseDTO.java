package com.vehicle.dto.request;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.vehicle.enums.PaymentStatus;

public class PaymentResponseDTO {

	 private Long id;
	    private BigDecimal amount;
	    private String currency;
	    private PaymentStatus status;
	    private String transactionRef;
	    private LocalDateTime createdAt;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public BigDecimal getAmount() {
			return amount;
		}
		public void setAmount(BigDecimal amount) {
			this.amount = amount;
		}
		public String getCurrency() {
			return currency;
		}
		public void setCurrency(String currency) {
			this.currency = currency;
		}
		public PaymentStatus getStatus() {
			return status;
		}
		public void setStatus(PaymentStatus status) {
			this.status = status;
		}
		public String getTransactionRef() {
			return transactionRef;
		}
		public void setTransactionRef(String transactionRef) {
			this.transactionRef = transactionRef;
		}
		public LocalDateTime getCreatedAt() {
			return createdAt;
		}
		public void setCreatedAt(LocalDateTime createdAt) {
			this.createdAt = createdAt;
		}
	    
	    
	
}
