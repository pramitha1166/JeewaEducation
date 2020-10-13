package com.graymatter.demo.service;

import java.util.List;

import com.graymatter.demo.model.PaymentForFB;

public interface PaymentFBListService {
	List<PaymentForFB> getAllVDetails();

	void deleteFBById(int id);
}
