package com.vehicle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle.dto.request.SparePartUsageRequestDTO;
import com.vehicle.dto.response.SparePartUsageResponseDTO;
import com.vehicle.service.SparePartUsageService;

@RestController
@RequestMapping("/api/sparse-part-usage")
public class SparsePartUsageController {

	private SparePartUsageService sparePartUsageService;
	
	
	
	@Autowired
	public SparsePartUsageController(SparePartUsageService sparePartUsageService) {
		super();
		this.sparePartUsageService = sparePartUsageService;
	}


	@PostMapping
	public SparePartUsageResponseDTO createSparePartUsage(@RequestBody SparePartUsageRequestDTO sparePartUsage)
	{
		return sparePartUsageService.createSparePartUsage(sparePartUsage);
	}
	
	@GetMapping
	public List<SparePartUsageResponseDTO> getAllSparePartUsage()
	{
		return sparePartUsageService.getAllSparePartUsage();
	}
	
	@GetMapping("/{id}")
	public SparePartUsageResponseDTO getSparePartUsageById(@PathVariable Long id)
	{
		return sparePartUsageService.getSparePartUsageById(id);
	}
	
}
