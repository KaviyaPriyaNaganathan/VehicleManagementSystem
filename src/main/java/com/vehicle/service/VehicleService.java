package com.vehicle.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vehicle.dto.request.VehicleRequestDTO;
import com.vehicle.dto.response.VehicleResponseDTO;
import com.vehicle.enums.VehicleStatus;

@Service
public interface VehicleService {

	VehicleResponseDTO createVehicle(VehicleRequestDTO vehicle);

	List<VehicleResponseDTO> getAllVehicles();

	VehicleResponseDTO getVehicleById(Long id);

	VehicleResponseDTO updateVehicleStatus(Long id, VehicleStatus status);

}
