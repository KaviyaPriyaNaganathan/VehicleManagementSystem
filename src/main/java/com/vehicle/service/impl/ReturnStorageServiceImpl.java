package com.vehicle.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicle.dto.request.ReturnStorageRequestDTO;
import com.vehicle.dto.response.ReturnStorageResponseDTO;
import com.vehicle.mapper.ReturnStorageMapper;
import com.vehicle.models.ReturnStorage;
import com.vehicle.models.Vehicle;
import com.vehicle.repository.ReturnStorageRepository;
import com.vehicle.repository.VehicleRespository;
import com.vehicle.service.ReturnStorageService;


@Service
public class ReturnStorageServiceImpl implements ReturnStorageService{

	private ReturnStorageRepository returnStorageRepository;
	private VehicleRespository vehicleRespository;
	
	@Autowired
	public ReturnStorageServiceImpl(ReturnStorageRepository returnStorageRepository,
			VehicleRespository vehicleRespository) {
		super();
		this.returnStorageRepository = returnStorageRepository;
		this.vehicleRespository = vehicleRespository;
	}

	@Override
	public ReturnStorageResponseDTO createReturnStorage(ReturnStorageRequestDTO returnStorage) {
		// TODO Auto-generated method stub
		Vehicle vehicle = vehicleRespository.findById(returnStorage.getVehicleId())
                .orElseThrow(() ->new RuntimeException("Vehicle not found with id " + returnStorage.getVehicleId()));

        ReturnStorage entity = ReturnStorageMapper.toEntity(returnStorage, vehicle);

        ReturnStorage saved = returnStorageRepository.save(entity);

        return ReturnStorageMapper.toResponse(saved);
	}



	@Override
	public List<ReturnStorageResponseDTO> getAllReturnStorages() {
		// TODO Auto-generated method stub
		 return returnStorageRepository.findAll()
	                .stream().map(ReturnStorageMapper::toResponse).toList();	
		 }

	@Override
	public ReturnStorageResponseDTO getReturnStorageById(Long id) {
		// TODO Auto-generated method stub
		ReturnStorage returnStorage = returnStorageRepository.findById(id)
                .orElseThrow(() ->new RuntimeException("ReturnStorage not found with id " + id));

        return ReturnStorageMapper.toResponse(returnStorage);
	}
	
	
}
