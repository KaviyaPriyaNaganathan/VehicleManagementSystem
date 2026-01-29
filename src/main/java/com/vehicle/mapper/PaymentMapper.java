package com.vehicle.mapper;

import com.vehicle.dto.request.PaymentResponseDTO;
import com.vehicle.dto.response.PaymentRequestDTO;
import com.vehicle.models.Payment;

public class PaymentMapper {

	public static Payment toEntity(PaymentRequestDTO dto)
	{
		
        if (dto == null) return null;

        Payment payment = new Payment();
        
        payment.setAmount(dto.getAmount());
        payment.setCurrency(dto.getCurrency());
        payment.setStatus(dto.getStatus());
        payment.setTransactionRef(dto.getTransactionRef());
        return payment;
    }

	
	
    public static PaymentResponseDTO toResponse(Payment payment)
    {
    	
        if (payment == null) return null;

        PaymentResponseDTO dto = new PaymentResponseDTO();
        dto.setId(payment.getId());
        dto.setAmount(payment.getAmount());
        dto.setCurrency(payment.getCurrency());
        dto.setStatus(payment.getStatus());
        dto.setTransactionRef(payment.getTransactionRef());
        dto.setCreatedAt(payment.getCreatedAt());
        return dto;
    }
}

