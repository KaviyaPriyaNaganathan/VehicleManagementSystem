package com.vehicle.mapper;

import com.vehicle.dto.request.StockRequestDTO;
import com.vehicle.dto.response.StockResponseDTO;
import com.vehicle.models.Stock;

public class StockMapper {

	public static Stock toEntity(StockRequestDTO dto)
	{
		Stock stock = new Stock();
		stock.setId(dto.getId());
	    stock.setQuantity(dto.getQuantity());
	    stock.setAvailable(dto.getAvailable());
	    stock.setLocation(dto.getLocation());
	    return stock;
	}
	
	public static StockResponseDTO toResponse(Stock dto)
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
