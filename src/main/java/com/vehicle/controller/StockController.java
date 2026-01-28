package com.vehicle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping
	public StockResponseDTO createStock(@RequestBody StockRequestDTO stock)
	{
		return stockService.createStock(stock);
		
	}
	
	@GetMapping
	public List<StockResponseDTO> getAllStocks()
	{
		return stockService.getAllStocks();
	}

	@GetMapping("/{id}")
	public StockResponseDTO getStockById(@PathVariable Long id)
	{
		return stockService.getStockById(id);
	}
	
	
	
	
}
