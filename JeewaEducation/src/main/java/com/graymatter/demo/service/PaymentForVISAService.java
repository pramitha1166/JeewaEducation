package com.graymatter.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graymatter.demo.model.PaymentForVISA;
import com.graymatter.demo.repo.PaymentForVISARepo;

@Service
public class PaymentForVISAService implements PaymentVisaListService{
	@Autowired
	PaymentForVISARepo repo;
	
	public void addPaymentForVISA(PaymentForVISA paymentForVISA) {
		repo.save(paymentForVISA);
	}
	@Override
	public List<PaymentForVISA> getAllVDetails(){
		return repo.findAll();
	}
}
