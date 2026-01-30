package com.vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vehicle.models.Payment;

public interface PaymentRepository  extends JpaRepository<Payment,Long>{

}
