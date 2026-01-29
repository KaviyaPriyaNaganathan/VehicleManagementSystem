package com.vehicle.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicle.dto.request.SparePartUsageRequestDTO;
import com.vehicle.dto.response.SparePartUsageResponseDTO;
import com.vehicle.mapper.SparePartUsageMapper;
import com.vehicle.models.SparePart;
import com.vehicle.models.SparePartUsage;
import com.vehicle.models.Vehicle;
import com.vehicle.repository.SparePartRepository;
import com.vehicle.repository.SparePartUsageRepository;
import com.vehicle.repository.VehicleRespository;
import com.vehicle.service.SparePartUsageService;

@Service
public class SparePartUsageServiceImpl implements SparePartUsageService{

	private SparePartUsageRepository sparePartUsageRepository;
	private SparePartRepository sparePartRepository;
	private VehicleRespository vehicleRepository;
	
	
	@Autowired
	public SparePartUsageServiceImpl(SparePartUsageRepository sparePartUsageRepository) {
		super();
		this.sparePartUsageRepository = sparePartUsageRepository;
	}


	@Override
	public SparePartUsageResponseDTO createSparePartUsage(SparePartUsageRequestDTO sparePartUsage) {
		// TODO Auto-generated method stub
		SparePart sparePart = sparePartRepository.findById(sparePartUsage.getSparePartId())
		        .orElseThrow(() ->new RuntimeException("No SparePart found with id " + sparePartUsage.getSparePartId()));

		Vehicle vehicle = vehicleRepository.findById(sparePartUsage.getVehicleId())
		        .orElseThrow(() -> new RuntimeException("No Vehicle found with id " + sparePartUsage.getVehicleId()));

		SparePartUsage entitySparePartUsage =SparePartUsageMapper.toEntity(sparePartUsage, vehicle, sparePart);

		SparePartUsage saved = sparePartUsageRepository.save(entitySparePartUsage);

		return SparePartUsageMapper.toResponse(saved);

	}


	@Override
	public List<SparePartUsageResponseDTO> getAllSparePartUsage() {
		// TODO Auto-generated method stub
		return sparePartUsageRepository.findAll()
				.stream().map(SparePartUsageMapper::toResponse).toList();
	}


	@Override
	public SparePartUsageResponseDTO getSparePartUsageById(Long id) {
		// TODO Auto-generated method stub
		
		SparePartUsage sparePartUsage = sparePartUsageRepository.findById(id)
				.orElseThrow(()->new RuntimeException("Sparse Part Usage not found with id "+id));
		 
		return SparePartUsageMapper.toResponse(sparePartUsage);
	}

}
