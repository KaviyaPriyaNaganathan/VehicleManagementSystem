package com.vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehicle.models.SparePart;


@Repository

public interface SparePartRepository extends JpaRepository<SparePart, Long>{

}
