package com.vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehicle.models.User;

@Repository

public interface UserRepository extends JpaRepository< User, Long>{

}
