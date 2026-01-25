package com.vehicle.mapper;

import com.vehicle.dto.request.SparePartUsageRequestDTO;
import com.vehicle.dto.response.SparePartUsageResponseDTO;
import com.vehicle.models.SparePartUsage;

public class SparePartUsageMapper {

	public SparePartUsage toEntity(SparePartUsageRequestDTO dto)
	{
		SparePartUsage sparePartUsage = new SparePartUsage();
		sparePartUsage.setId(dto.getId());
		sparePartUsage.setRemarks(dto.getRemarks());
		sparePartUsage.setSparePartId(dto.getSparePartId());
		sparePartUsage.setUsedDate(dto.getUsedDate());
		sparePartUsage.setUsedQuantity(dto.getUsedQuantity());
		sparePartUsage.setVehicle(dto.getVehicle());
		return sparePartUsage;
	}
	
	public SparePartUsageResponseDTO toResponse(SparePartUsage dto)
	{
		SparePartUsageResponseDTO response = new SparePartUsageResponseDTO();
		response.setId(dto.getId());
		response.setRemarks(dto.getRemarks());
		response.setSparePartId(dto.getSparePartId());
		response.setUsedDate(dto.getUsedDate());
		response.setUsedQuantity(dto.getUsedQuantity());
		response.setVehicle(dto.getVehicle());
		
		return response;
	}
}
