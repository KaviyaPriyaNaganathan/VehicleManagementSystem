package com.vehicle.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vehicle.dto.request.VehicleOwnershipRequestDTO;
import com.vehicle.dto.response.VehicleOwnershipResponseDTO;
import com.vehicle.enums.OwnershipStatus;

@Service
public interface VehicleOwnershipService {

	VehicleOwnershipResponseDTO createVehicleOwnership(VehicleOwnershipRequestDTO vehicleOwnership);

	List<VehicleOwnershipResponseDTO> getAllVehicleOwnership();

	VehicleOwnershipResponseDTO getVehicleById(Long id);

	VehicleOwnershipResponseDTO updateVehicleOwnershipStatus(Long id, OwnershipStatus status);

}
