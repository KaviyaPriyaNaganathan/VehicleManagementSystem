package com.vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vehicle.models.VehicleOwnership;

public interface VehicleOwnershipRespository extends JpaRepository<VehicleOwnership,Long>{

}
