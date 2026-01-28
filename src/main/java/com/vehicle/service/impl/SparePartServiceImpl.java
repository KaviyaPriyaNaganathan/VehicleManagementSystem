package com.vehicle.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicle.dto.request.SparePartRequestDTO;
import com.vehicle.dto.response.SparePartResponseDTO;
import com.vehicle.enums.SparePartStatus;
import com.vehicle.mapper.SparePartMapper;
import com.vehicle.models.SparePart;
import com.vehicle.repository.SparePartRepository;
import com.vehicle.service.SparePartService;

@Service
public class SparePartServiceImpl implements SparePartService{

	private SparePartRepository sparePartRepository;
	
	
	@Autowired
	public SparePartServiceImpl(SparePartRepository sparePartRepository) {
		super();
		this.sparePartRepository = sparePartRepository;
	}


	@Override
	public SparePartResponseDTO createSparePart(SparePartRequestDTO sparePart) {
		// TODO Auto-generated method stub
		
		if(sparePartRepository.existsByPartCode(sparePart.getPartCode()))
		{
			throw new RuntimeException("PartCode already present.");
		}
		
		SparePart entitySparePart = SparePartMapper.toEntity(sparePart);
		SparePart savedSparePart = sparePartRepository.save(entitySparePart);		
		
		return SparePartMapper.toResponse(savedSparePart);
	}


	@Override
	public List<SparePartResponseDTO> getAllSpareParts() {
		// TODO Auto-generated method stub
		return sparePartRepository.findAll().stream().map(SparePartMapper::toResponse).toList();
	}


	@Override
	public SparePartResponseDTO getSparePartsById(Long id) {
		// TODO Auto-generated method stub
		
		SparePart sparePart = sparePartRepository.findById(id)
				.orElseThrow(()->new RuntimeException("Spare Part not found with id "+id));
		
		return SparePartMapper.toResponse(sparePart);
	}


	@Override
	public SparePartResponseDTO getSparsePartsByPartCode(String partCode) {
		// TODO Auto-generated method stub
		SparePart sparePart = sparePartRepository.findByPartCode(partCode)
				.orElseThrow(()->new RuntimeException("Spare Part not found with Part Code"+ partCode));
		
		return SparePartMapper.toResponse(sparePart);
	}


	@Override
	public SparePartResponseDTO updateSparsePartStatus(Long id, SparePartStatus status) {
		// TODO Auto-generated method stub
		SparePart sparePart = sparePartRepository.findById(id)
				.orElseThrow(()->new RuntimeException("Spare Part not found with id "+id));
		
		sparePart.setStatus(status);
		
		SparePart savedSparePart = sparePartRepository.save(sparePart);
		return SparePartMapper.toResponse(savedSparePart);
	}
	
	

}
