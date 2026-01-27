package com.vehicle.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.vehicle.dto.request.VehicleRequestDTO;
import com.vehicle.dto.response.VehicleResponseDTO;
import com.vehicle.repository.VehicleRespository;
import com.vehicle.service.VehicleService;

public class VehicleServiceImpl implements VehicleService{

	private VehicleRespository vehicleRespository;
	
	@Autowired
	public VehicleServiceImpl(VehicleRespository vehicleRepository) {
		super();
		this.vehicleRespository = vehicleRepository;
	}
	
	@Override
	public ResponseEntity<VehicleResponseDTO> createVehicle(VehicleRequestDTO vehicle) {
		// TODO Auto-generated method stub
		return null;
	}



}
