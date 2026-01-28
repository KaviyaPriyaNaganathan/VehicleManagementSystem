package com.vehicle.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicle.dto.request.StockRequestDTO;
import com.vehicle.dto.response.StockResponseDTO;
import com.vehicle.mapper.StockMapper;
import com.vehicle.models.Stock;
import com.vehicle.models.Vehicle;
import com.vehicle.repository.StockRepository;
import com.vehicle.repository.VehicleRespository;
import com.vehicle.service.StockService;

@Service
public class StockServiceImpl implements StockService{

	private StockRepository stockRepository;
	private VehicleRespository vehicleRepository;
	
	@Autowired
	public StockServiceImpl(StockRepository stockRepository, 
			VehicleRespository vehicleRepository) {
		super();
		this.stockRepository = stockRepository;
		this.vehicleRepository = vehicleRepository;
	}
	
	@Override
	public StockResponseDTO createStock(StockRequestDTO dto) {
		// TODO Auto-generated method stub
		
		  if (dto.getVehicleId() == null) 
		  {
		        throw new RuntimeException("Vehicle ID is required");
		  }

		
		 Vehicle vehicle = vehicleRepository.findById(dto.getVehicleId())
			        .orElseThrow(() -> new RuntimeException("Vehicle not found"));

			    Stock stock = StockMapper.toEntity(dto);
			    stock.setVehicle(vehicle);

			    Stock saved = stockRepository.save(stock);

			    return StockMapper.toResponse(saved);
	}

	@Override
	public List<StockResponseDTO> getAllStocks() {
		// TODO Auto-generated method stub
		return stockRepository.findAll()
				.stream()
				.map(StockMapper::toResponse)
				.toList();
	}

	@Override
	public StockResponseDTO getStockById(Long id) {
		// TODO Auto-generated method stub
		
		Stock stock = stockRepository.findById(id)
				.orElseThrow(()->new RuntimeException("Stock not found with id "+id));	
		
		return StockMapper.toResponse(stock);
	}



}
