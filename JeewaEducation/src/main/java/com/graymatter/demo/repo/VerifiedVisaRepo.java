package com.graymatter.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.graymatter.demo.model.VerifiedVisa;

@Repository
public interface VerifiedVisaRepo extends JpaRepository<VerifiedVisa, Integer> {
	VerifiedVisa findByStdid(String id);
}
