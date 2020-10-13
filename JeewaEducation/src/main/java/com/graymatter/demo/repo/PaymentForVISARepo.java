package com.graymatter.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graymatter.demo.model.PaymentForVISA;

public interface PaymentForVISARepo extends JpaRepository<PaymentForVISA, Integer> {

}
