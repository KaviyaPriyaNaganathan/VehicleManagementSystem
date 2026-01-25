package com.vehicle.mapper;


import com.vehicle.dto.request.ReturnStorageRequestDTO;
import com.vehicle.dto.response.ReturnStorageResponseDTO;
import com.vehicle.models.ReturnStorage;


public class ReturnStorageMapper {

	public ReturnStorage toEntity(ReturnStorageRequestDTO dto)
	{
		ReturnStorage returnStorage = new ReturnStorage();
		returnStorage.setVehicle(dto.getVehicle());
		returnStorage.setReturnType(dto.getReturnType());
		returnStorage.setReason(dto.getReason());
		returnStorage.setReturnDate(dto.getReturnDate());
		returnStorage.setStorageLocation(dto.getStorageLocation());
		
		return returnStorage;
	}
	
	
	public ReturnStorageResponseDTO toResponse(ReturnStorage dto)
	{
	
		ReturnStorageResponseDTO response = new ReturnStorageResponseDTO();
		response.setId(dto.getId());
		response.setVehicle(dto.getVehicle());
		response.setReturnType(dto.getReturnType());
		response.setReason(dto.getReason());
		response.setReturnDate(dto.getReturnDate());
		response.setStorageLocation(dto.getStorageLocation());
		
		return response;
	}
}
