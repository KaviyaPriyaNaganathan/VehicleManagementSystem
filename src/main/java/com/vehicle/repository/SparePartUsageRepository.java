package com.vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehicle.models.SparePartUsage;

@Repository

public interface SparePartUsageRepository extends JpaRepository<SparePartUsage,Long>{

}
