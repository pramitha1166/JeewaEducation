package com.graymatter.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.graymatter.demo.model.PaymentForVISA;
import com.graymatter.demo.service.PaymentForVISAService;

@Controller
public class PaymentForVISAController {
	@Autowired
	PaymentForVISAService service;
	
	@PostMapping(value="/submitvisapayments")
	public String addPaymentForVISA(PaymentForVISA paymentForVISA) {
		service.addPaymentForVISA(paymentForVISA);
		return "redirect:/payment-summery";
	}
	
	@GetMapping(value="/paymentsum")
	public String viewSummery(Model model) {
		model.addAttribute("listvsummery",service.getAllVDetails());
		return "redirect:/payment-summery";
	}
	@GetMapping("/admin/payment-VISA")
	public String viewVList(Model model) {
		model.addAttribute("paymentvisalist",service.getAllVDetails());
		return "payment/paymentVISA";
	}
	
}
