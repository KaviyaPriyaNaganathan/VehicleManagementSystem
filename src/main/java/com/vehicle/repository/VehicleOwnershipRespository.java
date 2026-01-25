package com.vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehicle.models.VehicleOwnership;


@Repository

public interface VehicleOwnershipRespository extends JpaRepository<VehicleOwnership,Long>{

}
