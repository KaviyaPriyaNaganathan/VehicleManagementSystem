package com.vehicle.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vehicle.dto.request.ServiceRecordRequestDTO;
import com.vehicle.dto.response.ServiceRecordResponseDTO;
import com.vehicle.dto.response.UpdateServiceRecordStatus;
import com.vehicle.enums.ServiceStatus;

@Service
public interface ServiceRecordService {

	ServiceRecordResponseDTO createServiceRecord(ServiceRecordRequestDTO serviceRecord);

	List<ServiceRecordResponseDTO> getAllServiceRecords();

	ServiceRecordResponseDTO getServiceRecordById(Long id);

	ServiceRecordResponseDTO updateServiceRecordStatus(Long id, UpdateServiceRecordStatus status);

}
