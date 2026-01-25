package com.vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehicle.models.Stock;

@Repository

public interface StockRepository extends JpaRepository<Stock,Long>{

}
