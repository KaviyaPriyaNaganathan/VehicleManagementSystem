package com.vehicle.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.vehicle.dto.request.VehicleRequestDTO;
import com.vehicle.dto.response.VehicleResponseDTO;

@Service
public interface VehicleService {

	ResponseEntity<VehicleResponseDTO> createVehicle(VehicleRequestDTO vehicle);

}
