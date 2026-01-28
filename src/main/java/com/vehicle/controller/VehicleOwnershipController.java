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

import com.vehicle.dto.request.VehicleOwnershipRequestDTO;
import com.vehicle.dto.response.UpdateVehicleOwnershipStatusDTO;
import com.vehicle.dto.response.VehicleOwnershipResponseDTO;
import com.vehicle.service.VehicleOwnershipService;

@RestController
@RequestMapping("/api/vehicle-ownership")
public class VehicleOwnershipController {

	private VehicleOwnershipService vehicleOwnershipService;
	
	
	@Autowired
	public VehicleOwnershipController(VehicleOwnershipService vehicleOwnershipService) {
		super();
		this.vehicleOwnershipService = vehicleOwnershipService;
	}



	@PostMapping
	public VehicleOwnershipResponseDTO createVehicleOwnership(@RequestBody VehicleOwnershipRequestDTO vehicleOwnership)
	{
		return vehicleOwnershipService.createVehicleOwnership(vehicleOwnership);
	}
	
	@GetMapping
	public List<VehicleOwnershipResponseDTO> getAllVehicleOwnership()
	{
		return vehicleOwnershipService.getAllVehicleOwnership();
	}
	
	@GetMapping("/{id}")
	public VehicleOwnershipResponseDTO getVehicleById(@PathVariable Long id)
	{
		return vehicleOwnershipService.getVehicleById(id);
	}
	
	@PutMapping("/{id}/status")
	public VehicleOwnershipResponseDTO updateVehicleOwnershipStatus(
	        @PathVariable Long id,
	        @RequestBody UpdateVehicleOwnershipStatusDTO dto) {
	    return vehicleOwnershipService.updateVehicleOwnershipStatus(id, dto.getStatus());
	}

	
}
