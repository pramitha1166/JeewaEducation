package com.graymatter.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;

import com.graymatter.demo.model.PaymentForFB;
import com.graymatter.demo.service.PaymentForFBService;

@Controller
public class PaymentForFBController {
	@Autowired
	PaymentForFBService service;
	
	@PostMapping(value="/submitfbpayments")
	public String addPaymentForFB(PaymentForFB paymentForFB) {
		service.addPaymentForFB(paymentForFB);
		return "redirect:/payment-summery";
	}
	
	@GetMapping("/admin/payment-FoundationBatch")
	public String viewVList(Model model) {
		model.addAttribute("listFBPayment",service.getAllVDetails());
		return "payment/paymentFB";
	}
	
}
