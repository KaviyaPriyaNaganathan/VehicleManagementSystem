package com.vehicle.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicle.dto.request.VehicleRequestDTO;
import com.vehicle.dto.response.VehicleResponseDTO;
import com.vehicle.mapper.VehicleMapper;
import com.vehicle.models.Vehicle;
import com.vehicle.repository.VehicleRespository;
import com.vehicle.service.VehicleService;

@Service
public class VehicleServiceImpl implements VehicleService{

	private VehicleRespository vehicleRespository;
	
	@Autowired
	public VehicleServiceImpl(VehicleRespository vehicleRepository) {
		super();
		this.vehicleRespository = vehicleRepository;
	}
	
	@Override
	public VehicleResponseDTO createVehicle(VehicleRequestDTO vehicle) {
		// TODO Auto-generated method stub
		if(vehicleRespository.existsByengineNumber(vehicle.getEngineNumber()))
		{
			throw new RuntimeException("Vehicles already found with Engine Number "+vehicle.getEngineNumber());
		}
		
		Vehicle entityVehicle = VehicleMapper.toEntity(vehicle);
		
		Vehicle savedVehicle = vehicleRespository.save(entityVehicle);
				
		return VehicleMapper.toResponse(savedVehicle);
	}



}
