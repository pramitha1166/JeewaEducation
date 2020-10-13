package com.graymatter.demo.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.graymatter.demo.model.CompanyExpences;

public interface PaymentExpenceListService {
	List<CompanyExpences> getAllVDetails();

	CompanyExpences getExpensesById(int id);
	
	void deleteExpencesById(int id);
	
	public Long sumExpences();
}
