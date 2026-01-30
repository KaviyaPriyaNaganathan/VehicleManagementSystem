package com.vehicle.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vehicle.dto.request.ReturnStorageRequestDTO;
import com.vehicle.dto.response.ReturnStorageResponseDTO;

@Service
public interface ReturnStorageService {

	ReturnStorageResponseDTO createReturnStorage(ReturnStorageRequestDTO returnStorage);

	List<ReturnStorageResponseDTO> getAllReturnStorages();


	ReturnStorageResponseDTO getReturnStorageById(Long id);

}
