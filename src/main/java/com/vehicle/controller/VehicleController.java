package com.vehicle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle.dto.request.VehicleRequestDTO;
import com.vehicle.dto.response.VehicleResponseDTO;
import com.vehicle.enums.VehicleStatus;
import com.vehicle.service.VehicleService;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

	
	private VehicleService vehicleService;
	
	@Autowired
	public VehicleController(VehicleService vehicleService) {
		super();
		this.vehicleService = vehicleService;
	}
	
	
	@PostMapping
	public VehicleResponseDTO createVehicle(@RequestBody VehicleRequestDTO vehicle)
	{
		return vehicleService.createVehicle(vehicle);
	}

	@GetMapping
	public List<VehicleResponseDTO> getAllVehicles()
	{
		return vehicleService.getAllVehicles();
	}

	@GetMapping("/{id}")
	public VehicleResponseDTO getVehicleById(@PathVariable Long id)
	{
		return vehicleService.getVehicleById(id);
	}
	
	@PutMapping("/{id}/status")
	public VehicleResponseDTO updateVehicleStatus(@PathVariable Long id, @RequestBody VehicleStatus status)
	{
		return vehicleService.updateVehicleStatus(id, status);
	}
	
	
}
