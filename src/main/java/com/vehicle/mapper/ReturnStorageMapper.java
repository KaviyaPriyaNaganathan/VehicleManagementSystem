package com.vehicle.mapper;

import com.vehicle.dto.request.ReturnStorageRequestDTO;
import com.vehicle.dto.response.ReturnStorageResponseDTO;
import com.vehicle.models.ReturnStorage;
import com.vehicle.models.Vehicle;

public class ReturnStorageMapper {
    public static ReturnStorage toEntity(ReturnStorageRequestDTO dto,Vehicle vehicle) 
    {

        ReturnStorage entity = new ReturnStorage();
       
        entity.setVehicle(vehicle);
        entity.setReturnType(dto.getReturnType());
        entity.setReason(dto.getReason());
        entity.setReturnDate(dto.getReturnDate());
        entity.setStorageLocation(dto.getStorageLocation());
        entity.setReturnFee(dto.getReturnFee());

        return entity;
    }

    public static ReturnStorageResponseDTO toResponse(ReturnStorage entity) 
	{

        ReturnStorageResponseDTO response = new ReturnStorageResponseDTO();
        
        response.setId(entity.getId());
        response.setVehicleId(entity.getVehicle().getId());
        response.setReturnType(entity.getReturnType());
        response.setReason(entity.getReason());
        response.setReturnDate(entity.getReturnDate());
        response.setStorageLocation(entity.getStorageLocation());
        response.setReturnFee(entity.getReturnFee());

        if (entity.getPayment() != null) {
            response.setPaymentId(entity.getPayment().getId());
        }

        return response;
    }
}
