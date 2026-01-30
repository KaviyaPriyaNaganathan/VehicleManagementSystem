package com.vehicle.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehicle.models.Stock;
import com.vehicle.models.Vehicle;

@Repository

public interface StockRepository extends JpaRepository<Stock,Long>{

    Optional<Stock> findByVehicle(Vehicle vehicle);


}
