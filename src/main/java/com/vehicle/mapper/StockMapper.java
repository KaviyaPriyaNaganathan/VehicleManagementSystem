package com.vehicle.mapper;

import com.vehicle.dto.request.StockRequestDTO;
import com.vehicle.dto.response.StockResponseDTO;
import com.vehicle.models.Stock;
import com.vehicle.models.Vehicle;



public class StockMapper {

    public static Stock toEntity(StockRequestDTO dto, Vehicle vehicle) 
    {

        Stock stock = new Stock();

        stock.setVehicle(vehicle);        
        stock.setQuantity(dto.getQuantity());
        stock.setLocation(dto.getLocation());
        stock.setUnitPrice(dto.getUnitPrice());
        stock.setCurrency(dto.getCurrency());
        stock.setPaymentStatus(dto.getPaymentStatus());
        stock.setLastPaymentDate(dto.getLastPaymentDate());

        return stock;
    }

    public static StockResponseDTO toResponse(Stock stock) {

        StockResponseDTO dto = new StockResponseDTO();

        dto.setId(stock.getId());
        dto.setQuantity(stock.getQuantity());
        dto.setAvailable(stock.getAvailable());
        dto.setLocation(stock.getLocation());
        dto.setAddedDate(stock.getAddedDate());
        dto.setUnitPrice(stock.getUnitPrice());
        dto.setTotalPrice(stock.getTotalPrice());
        dto.setCurrency(stock.getCurrency());
        dto.setPaymentStatus(stock.getPaymentStatus());
        dto.setLastPaymentDate(stock.getLastPaymentDate());

        if (stock.getVehicle() != null) 
        {
            dto.setVehicleId(stock.getVehicle().getId());
            dto.setVehicle(stock.getVehicle());
        }

        return dto;
    }
}
