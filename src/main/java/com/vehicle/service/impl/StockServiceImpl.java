package com.vehicle.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicle.dto.request.StockRequestDTO;
import com.vehicle.dto.response.StockResponseDTO;
import com.vehicle.enums.VehicleStatus;
import com.vehicle.mapper.StockMapper;
import com.vehicle.models.Stock;
import com.vehicle.models.Vehicle;
import com.vehicle.repository.StockRepository;
import com.vehicle.repository.VehicleRespository;
import com.vehicle.service.StockService;

@Service
public class StockServiceImpl implements StockService{

	private final StockRepository stockRepository;
    private final VehicleRespository vehicleRepository;

    @Autowired
    public StockServiceImpl(StockRepository stockRepository,
    		VehicleRespository vehicleRepository) {
        this.stockRepository = stockRepository;
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public StockResponseDTO createStock(StockRequestDTO dto) {

        if (dto.getVehicleId() == null)
        {
            throw new IllegalArgumentException("Vehicle ID is required");
        }

        Vehicle vehicle = vehicleRepository.findById(dto.getVehicleId())
                .orElseThrow(() -> new RuntimeException("Vehicle not found"));

        
        if (dto.getQuantity() == 0) 
            vehicle.setStatus(VehicleStatus.OUT_OF_STOCK);
           
        else 
            vehicle.setStatus(VehicleStatus.IN_STOCK);
        
        Stock stock = StockMapper.toEntity(dto, vehicle);


        stock.setAvailable(dto.getQuantity() != null && dto.getQuantity() > 0);
        
        
        Stock saved = stockRepository.save(stock);

        return StockMapper.toResponse(saved);
    }

    @Override
    public List<StockResponseDTO> getAllStocks() {
        return stockRepository.findAll()
                .stream()
                .map(StockMapper::toResponse)
                .toList();
    }

    @Override
    public StockResponseDTO getStockById(Long id) {

        Stock stock = stockRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Stock not found with id " + id));

        return StockMapper.toResponse(stock);
    }


}
