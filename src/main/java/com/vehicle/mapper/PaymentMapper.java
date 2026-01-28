package com.vehicle.mapper;

import com.vehicle.dto.request.PaymentResponseDTO;
import com.vehicle.dto.response.PaymentRequestDTO;
import com.vehicle.models.Payment;

public class PaymentMapper {

	public static Payment toEntity(PaymentRequestDTO dto) {
        if (dto == null) return null;

        Payment p = new Payment();
        p.setAmount(dto.getAmount());
        p.setCurrency(dto.getCurrency());
        p.setStatus(dto.getStatus());
        p.setTransactionRef(dto.getTransactionRef());
        return p;
    }

    public static PaymentResponseDTO toResponse(Payment p) {
        if (p == null) return null;

        PaymentResponseDTO dto = new PaymentResponseDTO();
        dto.setId(p.getId());
        dto.setAmount(p.getAmount());
        dto.setCurrency(p.getCurrency());
        dto.setStatus(p.getStatus());
        dto.setTransactionRef(p.getTransactionRef());
        dto.setCreatedAt(p.getCreatedAt());
        return dto;
    }
}

