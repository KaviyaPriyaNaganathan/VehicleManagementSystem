package com.vehicle.mapper;

import com.vehicle.dto.request.VehicleOwnershipRequestDTO;
import com.vehicle.dto.response.VehicleOwnershipResponseDTO;
import com.vehicle.models.User;
import com.vehicle.models.Vehicle;
import com.vehicle.models.VehicleOwnership;

public class VehicleOwnershipMapper {

    public static VehicleOwnership toEntity(
           VehicleOwnershipRequestDTO dto,
            Vehicle vehicle,
            User customer) {

        VehicleOwnership ownership = new VehicleOwnership();
        ownership.setVehicle(vehicle);
        ownership.setCustomer(customer);
        ownership.setOwnershipStartDate(dto.getOwnershipStartDate());
        ownership.setOwnershipEndDate(dto.getOwnershipEndDate());
        ownership.setStatus(dto.getStatus());
        return ownership;
    }
    
    
    
    public static VehicleOwnershipResponseDTO toResponse(VehicleOwnership entity) {

        VehicleOwnershipResponseDTO response = new VehicleOwnershipResponseDTO();
        response.setId(entity.getId());
        response.setVehicleId(entity.getVehicle().getId());
        response.setCustomerId(entity.getCustomer().getId());
        response.setOwnershipStartDate(entity.getOwnershipStartDate());
        response.setOwnershipEndDate(entity.getOwnershipEndDate());
        response.setStatus(entity.getStatus());
        response.setCreatedDate(entity.getCreatedDate());
        response.setUpdatedDate(entity.getUpdatedDate());
        return response;
    }
}
