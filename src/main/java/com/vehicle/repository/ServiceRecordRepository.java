package com.vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vehicle.models.ServiceRecord;

public interface ServiceRecordRepository extends JpaRepository<ServiceRecord,Long>{

}
