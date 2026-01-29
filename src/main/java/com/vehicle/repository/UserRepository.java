package com.vehicle.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehicle.enums.UserRole;
import com.vehicle.models.User;

@Repository

public interface UserRepository extends JpaRepository< User, Long>{

	boolean existsByUsername(String username);

	Optional<User> findByIdAndRole(Long technicianId, UserRole technician);


}
