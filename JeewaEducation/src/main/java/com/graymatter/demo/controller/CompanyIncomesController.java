package com.graymatter.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.graymatter.demo.model.CompanyIncomes;
import com.graymatter.demo.service.CompanyIncomesService;

@Controller
public class CompanyIncomesController {
	@Autowired
	CompanyIncomesService service;
	
	@PostMapping("admin/submitincomes") 
	public String addIncomes(CompanyIncomes companyIncomes) {
		service.addIncomes(companyIncomes);
		return "redirect:/admin/payment-Income-List";
	}
	
	
	@GetMapping("/admin/payment-Income-List")
	public String viewVList(Model model) {
		model.addAttribute("paymentincomelist",service.getAllVDetails());
		return "payment/paymentIncomeList";
	}
}
