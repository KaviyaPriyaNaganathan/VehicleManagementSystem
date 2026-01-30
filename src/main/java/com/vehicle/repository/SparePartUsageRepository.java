package com.vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehicle.dto.request.SparePartUsageRequestDTO;
import com.vehicle.dto.response.SparePartUsageResponseDTO;
import com.vehicle.models.SparePartUsage;

@Repository

public interface SparePartUsageRepository extends JpaRepository<SparePartUsage,Long>{

}
