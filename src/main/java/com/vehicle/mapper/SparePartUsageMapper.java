package com.vehicle.mapper;



import com.vehicle.dto.request.SparePartUsageRequestDTO;
import com.vehicle.dto.response.SparePartUsageResponseDTO;
import com.vehicle.models.SparePart;
import com.vehicle.models.SparePartUsage;
import com.vehicle.models.Vehicle;

public class SparePartUsageMapper {
	
	
    public static SparePartUsage toEntity(SparePartUsageRequestDTO dto,Vehicle vehicle,SparePart sparePart) 
    {

        SparePartUsage usage = new SparePartUsage();
        
        usage.setVehicle(vehicle);
        usage.setSparePart(sparePart);
        usage.setUsedQuantity(dto.getUsedQuantity());
        usage.setUsedDate(dto.getUsedDate());
        usage.setRemarks(dto.getRemarks());
        
        return usage;
    }

    public static SparePartUsageResponseDTO toResponse(SparePartUsage entity) 
    {

        SparePartUsageResponseDTO response = new SparePartUsageResponseDTO();
        
        response.setId(entity.getId());
        response.setVehicleId(entity.getVehicle().getId());
        response.setSparePartId(entity.getSparePart().getId());
        response.setUsedQuantity(entity.getUsedQuantity());
        response.setUsedDate(entity.getUsedDate());
        response.setRemarks(entity.getRemarks());
        response.setUnitPrice(entity.getUnitPrice());
        response.setTotalPrice(entity.getTotalPrice());
        
        return response;
    }
}
