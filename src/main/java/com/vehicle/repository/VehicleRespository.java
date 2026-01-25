package com.vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehicle.models.Vehicle;


@Repository

public interface VehicleRespository extends JpaRepository<Vehicle,Long>{

}
