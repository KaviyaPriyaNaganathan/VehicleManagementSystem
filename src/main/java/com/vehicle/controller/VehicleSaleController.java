package com.vehicle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle.dto.request.VehicleSaleRequestDTO;
import com.vehicle.dto.response.StockResponseDTO;
import com.vehicle.dto.response.VehicleSaleResponseDTO;
import com.vehicle.service.VehicleSaleService;


@RestController
@RequestMapping("/api/vehicle-sale")
public class VehicleSaleController {

	 private final VehicleSaleService vehicleSaleService;

	    @Autowired
	    public VehicleSaleController(VehicleSaleService vehicleSaleService) {
	        this.vehicleSaleService = vehicleSaleService;
	    }

	    @PostMapping
	    public VehicleSaleResponseDTO createVehicleSale(@RequestBody VehicleSaleRequestDTO sale) {
	        return vehicleSaleService.createVehicleSale(sale);
	    }

	    @GetMapping
	    public List<VehicleSaleResponseDTO> getAllVehicleSales() {
	        return vehicleSaleService.getAllVehicleSales();
	    }

	    @GetMapping("/{id}")
	    public VehicleSaleResponseDTO getVehicleSaleById(@PathVariable Long id) {
	        return vehicleSaleService.getVehicleSaleById(id);
	    }
	    
	    @GetMapping("/search")
	    public List<StockResponseDTO> searchVehicles(@RequestParam String name) {
	        return vehicleSaleService.searchVehiclesByName(name);
	    }

	
}
