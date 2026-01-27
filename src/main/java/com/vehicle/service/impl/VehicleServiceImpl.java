package com.vehicle.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicle.dto.request.VehicleRequestDTO;
import com.vehicle.dto.response.VehicleResponseDTO;
import com.vehicle.enums.VehicleStatus;
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

	@Override
	public List<VehicleResponseDTO> getAllVehicles() {
		// TODO Auto-generated method stub
		return vehicleRespository.findAll()
				.stream()
				.map(VehicleMapper::toResponse)
				.toList();
	}

	@Override
	public VehicleResponseDTO getVehicleById(Long id) {
		// TODO Auto-generated method stub
		
		Vehicle vehicle = vehicleRespository.findById(id)
				.orElseThrow(()->new RuntimeException("No vehicle found with id: "+id));
		
		return VehicleMapper.toResponse(vehicle);
	}

	@Override
	public VehicleResponseDTO updateVehicleStatus(Long id, VehicleStatus status) {
		// TODO Auto-generated method stub
		
		
		Vehicle vehiclePresent = vehicleRespository.findById(id)
				.orElseThrow(()->new RuntimeException("No vehicle found with id: "+id));
		
		
		vehiclePresent.setStatus(status);
		
		Vehicle savedVehicle = vehicleRespository.save(vehiclePresent);
		
		
		return VehicleMapper.toResponse(savedVehicle);
	}



}
