package com.graymatter.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graymatter.demo.model.VerifiedVisa;
import com.graymatter.demo.repo.VerifiedVisaRepo;

@Service
public class VerifiedVisaService {

	@Autowired
	VerifiedVisaRepo repo;
	
	public VerifiedVisa findByStudentid(String id) {
		return repo.findByStdid(id);
	}
	
	
	
}
