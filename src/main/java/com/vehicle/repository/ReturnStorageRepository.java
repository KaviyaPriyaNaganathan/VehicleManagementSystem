package com.vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehicle.models.ReturnStorage;

@Repository
public interface ReturnStorageRepository extends JpaRepository<ReturnStorage, Long>{

}
