package com.vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vehicle.models.Stock;

public interface StockRepository extends JpaRepository<Stock,Long>{

}
