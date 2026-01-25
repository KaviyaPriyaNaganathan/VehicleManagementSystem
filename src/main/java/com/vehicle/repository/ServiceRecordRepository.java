package com.vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehicle.models.ServiceRecord;


@Repository
public interface ServiceRecordRepository extends JpaRepository<ServiceRecord,Long>{

}
