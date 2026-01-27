package com.vehicle.mapper;

import com.vehicle.dto.request.SparePartRequestDTO;
import com.vehicle.dto.response.SparePartResponseDTO;
import com.vehicle.models.SparePart;

public class SparePartMapper {

	public static SparePart toEntity(SparePartRequestDTO dto)
	{
		SparePart sparePart = new SparePart();
		sparePart.setId(dto.getId());
		sparePart.setPartCode(dto.getPartCode());
		sparePart.setPartName(dto.getPartName());
		sparePart.setPrice(dto.getPrice());
		sparePart.setCategory(dto.getCategory());
		sparePart.setQuantity(dto.getQuantity());
		sparePart.setStatus(dto.getStatus());
		
		
		return sparePart;
	}
	
	public static SparePartResponseDTO toResponse(SparePart dto)
	{
		SparePartResponseDTO response = new SparePartResponseDTO();
		response.setId(dto.getId());
		response.setPartCode(dto.getPartCode());
		response.setPartName(dto.getPartName());
		response.setCategory(dto.getCategory());
		response.setCreatedAt(dto.getCreatedAt());
		response.setPrice(dto.getPrice());
		response.setQuantity(dto.getQuantity());
		response.setStatus(dto.getStatus());
		
		return response;
	}
}
