package com.vehicle.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicle.dto.request.ServiceRecordRequestDTO;
import com.vehicle.dto.response.ServiceRecordResponseDTO;
import com.vehicle.dto.response.UpdateServiceRecordStatus;
import com.vehicle.enums.UserRole;
import com.vehicle.mapper.ServiceRecordMapper;
import com.vehicle.models.ServiceRecord;
import com.vehicle.models.User;
import com.vehicle.models.Vehicle;
import com.vehicle.repository.ServiceRecordRepository;
import com.vehicle.repository.UserRepository;
import com.vehicle.repository.VehicleRespository;
import com.vehicle.service.ServiceRecordService;


@Service
public class ServiceRecordServiceImpl implements ServiceRecordService{

	private ServiceRecordRepository serviceRecordRepository;
	private VehicleRespository vehicleRespository;
	private UserRepository userRepository;
	
	@Autowired
	
	public ServiceRecordServiceImpl(ServiceRecordRepository serviceRecordRepository, 
			VehicleRespository vehicleRespository,  UserRepository userRepository) {
		super();
		this.serviceRecordRepository = serviceRecordRepository;
		this.vehicleRespository = vehicleRespository;
		this.userRepository = userRepository;
	}

	@Override
	public ServiceRecordResponseDTO createServiceRecord(ServiceRecordRequestDTO serviceRecord) {
		 Vehicle vehicle = vehicleRespository.findById(serviceRecord.getVehicleId())
		            .orElseThrow(() -> new RuntimeException("Vehicle not found with id " + serviceRecord.getVehicleId()));

		 User technician = userRepository.findByIdAndRole(
				 serviceRecord.getTechnicianId(),
		            UserRole.TECHNICIAN
		    ).orElseThrow(() ->
		            new RuntimeException("Invalid technician ID")
		    );
		 
		 
		    ServiceRecord EntityserviceRecord = ServiceRecordMapper.toEntity(
		    		serviceRecord,
		            vehicle,
		            technician
		    );
		    ServiceRecord saved = serviceRecordRepository.save(EntityserviceRecord);
		    return ServiceRecordMapper.toResponse(saved);
	}

	@Override
	public List<ServiceRecordResponseDTO> getAllServiceRecords() {
		// TODO Auto-generated method stub
		 return serviceRecordRepository.findAll()
	                .stream()
	                .map(ServiceRecordMapper::toResponse).toList();
		 
	}
	@Override
	public ServiceRecordResponseDTO getServiceRecordById(Long id) {
		// TODO Auto-generated method stub
		ServiceRecord serviceRecord = serviceRecordRepository.findById(id)
				.orElseThrow(()->new RuntimeException("Service Record not found with id "+id));
		
	
		return ServiceRecordMapper.toResponse(serviceRecord);
	}

	@Override
	public ServiceRecordResponseDTO updateServiceRecordStatus(Long id, UpdateServiceRecordStatus status) {
		
		 ServiceRecord serviceRecord = serviceRecordRepository.findById(id)
		            .orElseThrow(() ->new RuntimeException("Service Record not found with id " + id));

		    serviceRecord.setStatus(status.getStatus());

		    ServiceRecord saved = serviceRecordRepository.save(serviceRecord);
		    
		    
		    return ServiceRecordMapper.toResponse(saved);
	}

}
