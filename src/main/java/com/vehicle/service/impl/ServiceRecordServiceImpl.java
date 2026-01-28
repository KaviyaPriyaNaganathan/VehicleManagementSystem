package com.vehicle.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.vehicle.dto.request.ServiceRecordRequestDTO;
import com.vehicle.dto.response.ServiceRecordResponseDTO;
import com.vehicle.repository.ServiceRecordRepository;
import com.vehicle.service.ServiceRecordService;

public class ServiceRecordServiceImpl implements ServiceRecordService{

	private ServiceRecordRepository serviceRecordRepository;
	
	
	@Autowired
	
	public ServiceRecordServiceImpl(ServiceRecordRepository serviceRecordRepository) {
		super();
		this.serviceRecordRepository = serviceRecordRepository;
	}

	@Override
	public ServiceRecordResponseDTO createServiceRecord(ServiceRecordRequestDTO serviceRecord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServiceRecordResponseDTO getAllServiceRecords() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServiceRecordResponseDTO getServiceRecordById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
