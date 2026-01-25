package com.vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vehicle.models.SparePart;

public interface SparePartRepository extends JpaRepository<SparePart, Long>{

}
