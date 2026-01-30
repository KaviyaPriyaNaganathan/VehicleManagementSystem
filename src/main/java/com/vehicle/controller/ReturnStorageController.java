package com.vehicle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle.dto.request.ReturnStorageRequestDTO;
import com.vehicle.dto.response.ReturnStorageResponseDTO;
import com.vehicle.service.ReturnStorageService;

@RestController
@RequestMapping("/api/return-storages")
public class ReturnStorageController {

	private ReturnStorageService returnStorageService;

	@Autowired

	public ReturnStorageController(ReturnStorageService returnStorageService) {
		super();
		this.returnStorageService = returnStorageService;
	}
	
	
	
	
	@PostMapping
	public ReturnStorageResponseDTO createReturnStorage(@RequestBody ReturnStorageRequestDTO returnStorage)
	{
		return returnStorageService.createReturnStorage(returnStorage);
	}

	@GetMapping
	public List<ReturnStorageResponseDTO> getAllReturnStorages()
	{
		return returnStorageService.getAllReturnStorages();
	}
	
	@GetMapping("/{id}")
	public ReturnStorageResponseDTO getReturnStorageById(@PathVariable Long id)
	{
		return returnStorageService.getReturnStorageById(id);
	}
	
	
	
}
