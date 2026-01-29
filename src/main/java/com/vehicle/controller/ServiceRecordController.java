package com.vehicle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle.dto.request.ServiceRecordRequestDTO;
import com.vehicle.dto.response.ServiceRecordResponseDTO;
import com.vehicle.dto.response.UpdateServiceRecordStatus;
import com.vehicle.service.ServiceRecordService;

@RestController
@RequestMapping("/api/service-record")
public class ServiceRecordController {

	private ServiceRecordService serviceRecordService;
	
	
	@Autowired
	public ServiceRecordController(ServiceRecordService serviceRecordService) {
		super();
		this.serviceRecordService = serviceRecordService;
	}



	@PostMapping
	public ServiceRecordResponseDTO createServiceRecord(@RequestBody ServiceRecordRequestDTO serviceRecord)
	{
		return serviceRecordService.createServiceRecord(serviceRecord);
	}
	
	@GetMapping 
	public List<ServiceRecordResponseDTO> getAllServiceRecords()
	{
		return serviceRecordService.getAllServiceRecords();
	}
	
	@GetMapping("/{id}")
	public ServiceRecordResponseDTO getServiceRecordById(@PathVariable Long id)
	{
		return serviceRecordService.getServiceRecordById(id);
	}
	
	@PutMapping("/{id}/status")
	public ServiceRecordResponseDTO updateServiceRecordStatus(@PathVariable Long id, @RequestBody UpdateServiceRecordStatus status)
	{
		return serviceRecordService.updateServiceRecordStatus(id, status);
	}
	
	
	
}
