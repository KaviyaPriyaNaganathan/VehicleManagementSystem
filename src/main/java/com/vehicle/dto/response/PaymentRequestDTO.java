package com.vehicle.dto.response;

import java.math.BigDecimal;

import com.vehicle.enums.PaymentStatus;

public class PaymentRequestDTO {
	
	    private BigDecimal amount;
	    private String currency;
	    private PaymentStatus status;
	    private String transactionRef;
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

	    

}
