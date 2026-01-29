package com.vehicle.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vehicle.dto.request.SparePartUsageRequestDTO;
import com.vehicle.dto.response.SparePartUsageResponseDTO;

@Service
public interface SparePartUsageService {

	SparePartUsageResponseDTO createSparePartUsage(SparePartUsageRequestDTO sparePartUsage);

	List<SparePartUsageResponseDTO> getAllSparePartUsage();

	SparePartUsageResponseDTO getSparePartUsageById(Long id);

}
