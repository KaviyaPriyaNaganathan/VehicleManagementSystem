package com.vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vehicle.models.User;

public interface UserRepository extends JpaRepository< User, Long>{

}
