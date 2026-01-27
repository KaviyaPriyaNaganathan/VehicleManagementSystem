package com.vehicle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle.dto.request.StockRequestDTO;
import com.vehicle.dto.response.StockResponseDTO;
import com.vehicle.service.StockService;

@RestController
@RequestMapping("/api/stock")
public class StockController {

	private StockService stockService;
	
	@Autowired
	public StockController(StockService stockService) {
		super();
		this.stockService = stockService;
	}
	
	public StockResponseDTO createStock(StockRequestDTO stock)
	{
		return null;
		
	}

	
	
}
