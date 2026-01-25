package com.vehicle.mapper;

import com.vehicle.dto.request.VehicleRequestDTO;
import com.vehicle.dto.response.VehicleResponseDTO;
import com.vehicle.models.Vehicle;

public class VehicleMapper {

	public Vehicle toEntity(VehicleRequestDTO dto)
	{
		Vehicle vehicle = new Vehicle();
		vehicle.setId(dto.getId());
		vehicle.setBrand(dto.getBrand());
		vehicle.setVehicleType(dto.getVehicleType());
		vehicle.setChassisNumber(dto.getChassisNumber());
		vehicle.setEngineNumber(dto.getEngineNumber());
		vehicle.setModel(dto.getModel());
		vehicle.setVehicleType(dto.getVehicleType());
		vehicle.setStatus(dto.getStatus());
		return vehicle;
	}
	
	public VehicleResponseDTO toResponse(Vehicle dto)
	{
		VehicleResponseDTO response = new VehicleResponseDTO();
		response.setBrand(dto.getBrand());
		response.setChassisNumber(dto.getChassisNumber());
		response.setCreatedAt(dto.getCreatedAt());
		response.setEngineNumber(dto.getEngineNumber());
		response.setModel(dto.getModel());
		response.setStatus(dto.getStatus());
		response.setUpdatedAt(dto.getUpdatedAt());
		response.setVehicleType(dto.getVehicleType());
		
		return response;
	}
	
}
