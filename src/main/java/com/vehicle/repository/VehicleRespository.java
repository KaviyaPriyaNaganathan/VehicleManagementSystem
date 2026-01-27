package com.vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.vehicle.dto.response.VehicleResponseDTO;
import com.vehicle.models.Vehicle;


@Repository

public interface VehicleRespository extends JpaRepository<Vehicle,Long>{

	boolean existsByengineNumber(String engineNumber);

}
