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

import com.vehicle.dto.request.SparePartRequestDTO;
import com.vehicle.dto.response.SparePartResponseDTO;
import com.vehicle.dto.response.SparePartStatusUpdateDTO;
import com.vehicle.service.SparePartService;

@RestController
@RequestMapping("/api/spare-part")
public class SparePartController {

	private SparePartService sparePartService;

	@Autowired
	public SparePartController(SparePartService sparePartService) {
		super();
		this.sparePartService = sparePartService;
	}
	
	
	@PostMapping
	public SparePartResponseDTO createSparePart(@RequestBody SparePartRequestDTO sparePart)
	{
		return sparePartService.createSparePart(sparePart);
	}
	
	@GetMapping
	public List<SparePartResponseDTO> getAllSpareParts()
	{
		return sparePartService.getAllSpareParts();
	}
	
	@GetMapping("/id/{id}")
	public SparePartResponseDTO getSparePartsById(@PathVariable Long id)
	{
		return sparePartService.getSparePartsById(id);
	}
	
	@GetMapping("/partCode/{partCode}")
	public SparePartResponseDTO getSparsePartsByPartCode(@PathVariable String partCode)
	{
		return sparePartService.getSparsePartsByPartCode(partCode);
	}
	
	@PutMapping("/{id}/status")
	public SparePartResponseDTO updateSparsePartStatus(
	        @PathVariable Long id,
	        @RequestBody SparePartStatusUpdateDTO statusDTO) {

	    return sparePartService.updateSparsePartStatus(id, statusDTO.getStatus());
	}

}



