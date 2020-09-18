package com.graymatter.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaymentController {
	@GetMapping("/admin/payment-dashboard")
	public String Payment_dashboard() {
		return "payment/paymentDashboard";
	}	
	
	@GetMapping("/admin/payment-report")
	public String Payment_report() {
		return "payment/paymentReport";
	}
	 
	@GetMapping("/admin/payment-expences-AUD")
	public String Payment_expences_aud() {
		return "payment/paymentExpencesAUD";
	}
	
	@GetMapping("/admin/payment-income-AUD")
	public String Payment_income_aud() {
		return "payment/paymentIncomeAUD";
	}
	
	@GetMapping("/payment-form-VISA")
	public String Payment_front_visa() {
		return "payment/paymentFrontVISA";
	}
	
	@GetMapping("/payment-form-Foundation-Batch")
	public String Payment_front_fb() {
		return "payment/paymentFrontFB";
	}
	
	@GetMapping("/payment-summery")
	public String Payment_front_summery() {
		return "payment/paymentSummery";
	}
}


