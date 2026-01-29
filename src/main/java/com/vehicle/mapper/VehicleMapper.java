package com.vehicle.mapper;


import com.vehicle.dto.request.VehicleRequestDTO;
import com.vehicle.dto.response.VehicleResponseDTO;
import com.vehicle.models.Vehicle;

public class VehicleMapper {

    public static Vehicle toEntity(VehicleRequestDTO dto)
    {
        Vehicle vehicle = new Vehicle();
        
        vehicle.setBrand(dto.getBrand());
        vehicle.setModel(dto.getModel());
        vehicle.setVehicleType(dto.getVehicleType());
        vehicle.setEngineNumber(dto.getEngineNumber());
        vehicle.setChassisNumber(dto.getChassisNumber());
        vehicle.setStatus(dto.getStatus());
        vehicle.setManufactureDate(dto.getManufactureDate());
        vehicle.setPurchasePrice(dto.getPurchasePrice());
        
        return vehicle;
    }

    public static VehicleResponseDTO toResponse(Vehicle vehicle) 
    {
        
    	VehicleResponseDTO response = new VehicleResponseDTO();
        
    	response.setId(vehicle.getId());
        response.setBrand(vehicle.getBrand());
        response.setModel(vehicle.getModel());
        response.setVehicleType(vehicle.getVehicleType());
        response.setEngineNumber(vehicle.getEngineNumber());
        response.setChassisNumber(vehicle.getChassisNumber());
        response.setStatus(vehicle.getStatus());
        response.setManufactureDate(vehicle.getManufactureDate());
        response.setCreatedAt(vehicle.getCreatedAt());
        response.setUpdatedAt(vehicle.getUpdatedAt());
        response.setPurchasePrice(vehicle.getPurchasePrice());
        
        return response;
    }
}
