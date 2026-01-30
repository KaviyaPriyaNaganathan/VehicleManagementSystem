package com.vehicle.mapper;

import com.vehicle.dto.request.VehicleSaleRequestDTO;
import com.vehicle.dto.response.VehicleSaleResponseDTO;
import com.vehicle.models.Payment;
import com.vehicle.models.Vehicle;
import com.vehicle.models.VehicleSale;

public class VehicleSaleMapper {

	public static VehicleSale toEntity(VehicleSaleRequestDTO dto, Vehicle vehicle, Payment payment) {
	    VehicleSale sale = new VehicleSale();
	    sale.setVehicle(vehicle);
	    sale.setQuantity(dto.getQuantity());
	    sale.setSaleDate(dto.getSaleDate());
	    sale.setPayment(payment);
	    return sale;
	}


    public static VehicleSaleResponseDTO toResponse(VehicleSale entity) 
    {
        
    	VehicleSaleResponseDTO dto = new VehicleSaleResponseDTO();
        
    	dto.setId(entity.getId());
        dto.setVehicleId(entity.getVehicle().getId());
        dto.setQuantity(entity.getQuantity());
        dto.setSaleDate(entity.getSaleDate());
        
        if (entity.getPayment() != null) 
        {
            dto.setPaymentId(entity.getPayment().getId());
        }
        return dto;
    
    }
}
