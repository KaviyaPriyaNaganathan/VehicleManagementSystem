package com.vehicle.mapper;



import com.vehicle.dto.request.SparePartRequestDTO;
import com.vehicle.dto.response.SparePartResponseDTO;
import com.vehicle.models.SparePart;

public class SparePartMapper {
	
    public static SparePart toEntity(SparePartRequestDTO dto) {
        SparePart sparePart = new SparePart();
        sparePart.setPartName(dto.getPartName());
        sparePart.setPartCode(dto.getPartCode());
        sparePart.setCategory(dto.getCategory());
        sparePart.setQuantity(dto.getQuantity());
        sparePart.setPrice(dto.getPrice());
        sparePart.setStatus(dto.getStatus());
        return sparePart;
    }

    public static SparePartResponseDTO toResponse(SparePart sparePart) {
        SparePartResponseDTO response = new SparePartResponseDTO();
        response.setId(sparePart.getId());
        response.setPartName(sparePart.getPartName());
        response.setPartCode(sparePart.getPartCode());
        response.setCategory(sparePart.getCategory());
        response.setQuantity(sparePart.getQuantity());
        response.setPrice(sparePart.getPrice());
        response.setTotalValue(sparePart.getTotalValue());
        response.setStatus(sparePart.getStatus());
        response.setCreatedAt(sparePart.getCreatedAt());
        return response;
    }
}
