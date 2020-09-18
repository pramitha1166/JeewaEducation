package com.graymatter.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.graymatter.demo.model.CompanyExpences;
import com.graymatter.demo.service.CompanyExpencesService;

@Controller
public class CompanyExpenesController {
	
	@Autowired
	CompanyExpencesService service;
	
	@PostMapping("admin/submitexpences")
	public String addExpences(CompanyExpences companyExpences) {
		service.addExpences(companyExpences);
		return "redirect:/admin/payment-Expences-List";
	}
	
	@GetMapping("/admin/payment-Expences-List")
	public String viewVList(Model model) {
		model.addAttribute("paymentexpencelist",service.getAllVDetails());
		return "payment/paymentExpencesList";
	}
}
