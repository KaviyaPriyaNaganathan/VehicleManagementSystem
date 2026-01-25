package com.vehicle.mapper;

import com.vehicle.dto.request.ServiceRecordRequestDTO;
import com.vehicle.dto.response.ServiceRecordResponseDTO;
import com.vehicle.models.ServiceRecord;

public class ServiceRecordMapper {

	public ServiceRecord toEntity(ServiceRecordRequestDTO dto)
	{
		ServiceRecord serviceRecord = new ServiceRecord();
		serviceRecord.setId(dto.getId());
		serviceRecord.setVehicle(dto.getVehicle());
		serviceRecord.setServiceCost(dto.getServiceCost());
		serviceRecord.setServiceDate(dto.getServiceDate());
		serviceRecord.setStatus(dto.getStatus());
		serviceRecord.setTechnicianId(dto.getTechnicianId());
		serviceRecord.setDescription(dto.getDescription());
		return serviceRecord;
	}
	
	public ServiceRecordResponseDTO toResponse(ServiceRecord dto)
	{
		ServiceRecordResponseDTO response = new ServiceRecordResponseDTO();
		response.setId(dto.getId());
		response.setDescription(dto.getDescription());
		response.setServiceCost(dto.getServiceCost());
		response.setServiceDate(dto.getServiceDate());
		response.setStatus(dto.getStatus());
		response.setVehicle(dto.getVehicle());
		response.setTechnicianId(dto.getTechnicianId());
		return response;
	}
	
}
