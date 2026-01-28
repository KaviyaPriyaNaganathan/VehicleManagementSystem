package com.vehicle.mapper;


import com.vehicle.dto.request.ReturnStorageRequestDTO;
import com.vehicle.dto.response.ReturnStorageResponseDTO;
import com.vehicle.models.Payment;
import com.vehicle.models.ReturnStorage;
import com.vehicle.models.Vehicle;

public class ReturnStorageMapper {

    public static ReturnStorage toEntity(
            ReturnStorageRequestDTO dto,
            Vehicle vehicle,
            Payment payment
    ) {

        ReturnStorage entity = new ReturnStorage();
        entity.setVehicle(vehicle);
        entity.setReturnType(dto.getReturnType());
        entity.setReason(dto.getReason());
        entity.setReturnDate(dto.getReturnDate());
        entity.setStorageLocation(dto.getStorageLocation());
        entity.setReturnFee(dto.getReturnFee());
        entity.setPayment(payment);

        return entity;
    }

    // Entity → Response DTO
    public static ReturnStorageResponseDTO toResponseDto(ReturnStorage entity) {

        ReturnStorageResponseDTO dto = new ReturnStorageResponseDTO();
        dto.setId(entity.getId());
        dto.setVehicleId(entity.getVehicle().getId());
        dto.setReturnType(entity.getReturnType());
        dto.setReason(entity.getReason());
        dto.setReturnDate(entity.getReturnDate());
        dto.setStorageLocation(entity.getStorageLocation());
        dto.setReturnFee(entity.getReturnFee());

        if (entity.getPayment() != null) {
            dto.setPaymentId(entity.getPayment().getId());
        }

        return dto;
    }
}
