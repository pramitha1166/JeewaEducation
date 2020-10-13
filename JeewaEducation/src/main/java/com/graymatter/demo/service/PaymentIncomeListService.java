package com.graymatter.demo.service;

import java.util.List;

import com.graymatter.demo.model.CompanyIncomes;

public interface PaymentIncomeListService {
	List<CompanyIncomes> getAllVDetails();

	void addIncomes(CompanyIncomes CompanyIncomes);

	CompanyIncomes getIncomesById(int id);

	void deleteIncomesById(int id);
}