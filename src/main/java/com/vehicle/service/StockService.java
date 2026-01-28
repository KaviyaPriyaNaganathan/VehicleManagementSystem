package com.vehicle.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vehicle.dto.request.StockRequestDTO;
import com.vehicle.dto.response.StockResponseDTO;

@Service
public interface StockService {

	StockResponseDTO createStock(StockRequestDTO stock);

	List<StockResponseDTO> getAllStocks();

	StockResponseDTO getStockById(Long id);

}
