package com.vehicle.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vehicle.dto.request.SparePartRequestDTO;
import com.vehicle.dto.response.SparePartResponseDTO;
import com.vehicle.enums.SparePartStatus;

@Service
public interface SparePartService {

	SparePartResponseDTO createSparePart(SparePartRequestDTO sparePart);

	List<SparePartResponseDTO> getAllSpareParts();

	SparePartResponseDTO getSparePartsById(Long id);

	SparePartResponseDTO getSparsePartsByPartCode(String partCode);

	SparePartResponseDTO updateSparsePartStatus(Long id, SparePartStatus status);

}
