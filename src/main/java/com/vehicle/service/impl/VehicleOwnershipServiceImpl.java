package com.vehicle.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicle.dto.request.VehicleOwnershipRequestDTO;
import com.vehicle.dto.response.VehicleOwnershipResponseDTO;
import com.vehicle.enums.OwnershipStatus;
import com.vehicle.mapper.VehicleOwnershipMapper;
import com.vehicle.models.User;
import com.vehicle.models.Vehicle;
import com.vehicle.models.VehicleOwnership;
import com.vehicle.repository.UserRepository;
import com.vehicle.repository.VehicleOwnershipRespository;
import com.vehicle.repository.VehicleRespository;
import com.vehicle.service.VehicleOwnershipService;


@Service
public class VehicleOwnershipServiceImpl implements VehicleOwnershipService{

	private VehicleOwnershipRespository vehicleOwnershipRespository;
	private VehicleRespository vehicleRepository;
	private UserRepository userRepository;
	
	@Autowired

	public VehicleOwnershipServiceImpl(VehicleOwnershipRespository vehicleOwnershipRespository,
			VehicleRespository vehicleRepository, UserRepository userRepository) {
		super();
		this.vehicleOwnershipRespository = vehicleOwnershipRespository;
		this.vehicleRepository = vehicleRepository;
		this.userRepository = userRepository;
	}


	
	
	
	@Override
	public VehicleOwnershipResponseDTO createVehicleOwnership(VehicleOwnershipRequestDTO vehicleOwnership) {
		// TODO Auto-generated method stub
		
		
		 if (vehicleOwnership.getVehicleId() == null || vehicleOwnership.getCustomerId() == null) 
		 {
		        throw new RuntimeException("Vehicle ID and Customer ID are required");
		 }
		
		
		 Vehicle vehicle = vehicleRepository.findById(vehicleOwnership.getVehicleId())
		            .orElseThrow(() -> new RuntimeException("Vehicle not found with id " + vehicleOwnership.getVehicleId()));

		 User customer = userRepository.findById(vehicleOwnership.getCustomerId())
		            .orElseThrow(() -> new RuntimeException("Customer not found with id " + vehicleOwnership.getCustomerId()));
		
		VehicleOwnership entityVehicleOwnership = VehicleOwnershipMapper.toEntity(vehicleOwnership, vehicle, customer);
		
	    VehicleOwnership savedVehicleOwnership = vehicleOwnershipRespository.save(entityVehicleOwnership);
		
	    
	    return VehicleOwnershipMapper.toResponse(savedVehicleOwnership);
	}





	@Override
	public List<VehicleOwnershipResponseDTO> getAllVehicleOwnership() {
		// TODO Auto-generated method stub
		return vehicleOwnershipRespository.findAll()
				.stream()
				.map(VehicleOwnershipMapper::toResponse)
				.toList();
	}





	@Override
	public VehicleOwnershipResponseDTO getVehicleById(Long id) {
		// TODO Auto-generated method stub
		VehicleOwnership vehicleOwnership = vehicleOwnershipRespository.findById(id)
				.orElseThrow(()->new RuntimeException("No Ownership Details found with id "+id));
		
		return VehicleOwnershipMapper.toResponse(vehicleOwnership);
		
	}

	@Override
	public VehicleOwnershipResponseDTO updateVehicleOwnershipStatus(Long id, OwnershipStatus status) {
		// TODO Auto-generated method stub
		VehicleOwnership vehicleOwnership = vehicleOwnershipRespository.findById(id)
				.orElseThrow(()->new RuntimeException("No Ownership Details found with id "+id));
		
		vehicleOwnership.setStatus(status);
		
		VehicleOwnership savedVehicleOwnership = vehicleOwnershipRespository.save(vehicleOwnership);
		
		
		return VehicleOwnershipMapper.toResponse(savedVehicleOwnership);
	}

	

}
