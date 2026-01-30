package com.vehicle.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vehicle.dto.request.VehicleSaleRequestDTO;
import com.vehicle.dto.response.StockResponseDTO;
import com.vehicle.dto.response.VehicleSaleResponseDTO;


@Service
public interface VehicleSaleService {

	VehicleSaleResponseDTO createVehicleSale(VehicleSaleRequestDTO sale);

	List<VehicleSaleResponseDTO> getAllVehicleSales();

	VehicleSaleResponseDTO getVehicleSaleById(Long id);

	List<StockResponseDTO> searchVehiclesByName(String name);

}
