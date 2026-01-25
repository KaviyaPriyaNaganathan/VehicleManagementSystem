package com.vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vehicle.models.Vehicle;

public interface VehicleRespository extends JpaRepository<Vehicle,Long>{

}
