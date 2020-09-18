package com.graymatter.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graymatter.demo.model.PaymentForFB;
import com.graymatter.demo.repo.PaymentForFBRepo;

@Service
public class PaymentForFBService implements PaymentFBListService {
	@Autowired
	PaymentForFBRepo repo;
	
	public void addPaymentForFB(PaymentForFB paymentForFB) {
		repo.save(paymentForFB);
	}
	@Override
	public List<PaymentForFB> getAllVDetails(){
		return repo.findAll();
	}
}
