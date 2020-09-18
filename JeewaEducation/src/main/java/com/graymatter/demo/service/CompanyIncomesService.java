package com.graymatter.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graymatter.demo.model.CompanyIncomes;
import com.graymatter.demo.repo.CompanyIncomesRepo;

@Service
public class CompanyIncomesService implements PaymentIncomeListService{

	@Autowired
	CompanyIncomesRepo repo;
	
	public void addIncomes(CompanyIncomes companyincomes) {
		repo.save(companyincomes);
	}
	
	@Override
	public List<CompanyIncomes> getAllVDetails(){
		return repo.findAll();
	}
}
