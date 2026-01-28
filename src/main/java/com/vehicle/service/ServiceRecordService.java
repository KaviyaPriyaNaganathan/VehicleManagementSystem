package com.vehicle.service;

import org.springframework.stereotype.Service;

import com.vehicle.dto.request.ServiceRecordRequestDTO;
import com.vehicle.dto.response.ServiceRecordResponseDTO;

@Service
public interface ServiceRecordService {

	ServiceRecordResponseDTO createServiceRecord(ServiceRecordRequestDTO serviceRecord);

	ServiceRecordResponseDTO getAllServiceRecords();

	ServiceRecordResponseDTO getServiceRecordById(Long id);

}
