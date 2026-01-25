package com.vehicle.mapper;

import com.vehicle.dto.request.VehicleOwnershipRequestDTO;
import com.vehicle.dto.response.VehicleOwnershipResponseDTO;
import com.vehicle.models.VehicleOwnership;

public class VehicleOwnershipMapper {

	public VehicleOwnership toEntity(VehicleOwnershipRequestDTO dto)
	{
		VehicleOwnership vehicleOwnership = new VehicleOwnership();
		vehicleOwnership.setCustomerId(dto.getCustomerId());
		vehicleOwnership.setCustomerId(dto.getCustomerId());
		vehicleOwnership.setOwnershipEndDate(dto.getOwnershipEndDate());
		vehicleOwnership.setOwnershipStartDate(dto.getOwnershipStartDate());
		vehicleOwnership.setStatus(dto.getStatus());
		vehicleOwnership.setVehicle(dto.getVehicle());		
		return vehicleOwnership;
		
	}
	
	public VehicleOwnershipResponseDTO toResponse(VehicleOwnership dto)
	{
		VehicleOwnershipResponseDTO response = new VehicleOwnershipResponseDTO();
		response.setCustomerId(dto.getCustomerId());
		response.setCreatedDate(dto.getCreatedDate());
		response.setId(dto.getId());
		response.setOwnershipEndDate(dto.getOwnershipEndDate());
		response.setOwnershipStartDate(dto.getOwnershipStartDate());
		response.setStatus(dto.getStatus());
		response.setUpdatedDate(dto.getUpdatedDate());
		response.setVehicle(dto.getVehicle());
		return response;
	}
	
}
