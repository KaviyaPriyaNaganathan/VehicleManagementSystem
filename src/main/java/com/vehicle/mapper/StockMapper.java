package com.vehicle.mapper;

import com.vehicle.dto.request.StockRequestDTO;
import com.vehicle.dto.response.StockResponseDTO;
import com.vehicle.models.Stock;

public class StockMapper {

	public Stock toEntity(StockRequestDTO dto)
	{
		Stock stock = new Stock();
		stock.setId(dto.getId());
		stock.setAvailable(dto.getAvailable());
		stock.setLocation(dto.getLocation());
		stock.setQuantity(dto.getQuantity());
		stock.setVehicle(dto.getVehicle());
			
		return stock;
	}
	
	public StockResponseDTO toResponse(Stock dto)
	{
		StockResponseDTO response = new StockResponseDTO();
		response.setId(dto.getId());
		response.setAddedDate(dto.getAddedDate());
		response.setAvailable(dto.getAvailable());
		response.setLocation(dto.getLocation());
		response.setQuantity(dto.getQuantity());
		response.setVehicle(dto.getVehicle());
		
		return response;
	}
}
