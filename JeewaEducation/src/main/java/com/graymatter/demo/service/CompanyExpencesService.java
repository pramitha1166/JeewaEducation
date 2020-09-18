package com.graymatter.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graymatter.demo.model.CompanyExpences;
import com.graymatter.demo.repo.CompanyExpencesRepo;


@Service
public class CompanyExpencesService implements PaymentExpenceListService{
	
	@Autowired
	CompanyExpencesRepo repo;
	
	public void addExpences(CompanyExpences companyexpences) {
		repo.save(companyexpences);
	}
	
	@Override
	public List<CompanyExpences> getAllVDetails(){
		return repo.findAll();
	}
}
