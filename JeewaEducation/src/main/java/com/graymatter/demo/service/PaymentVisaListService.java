package com.graymatter.demo.service;

import java.util.List;
import com.graymatter.demo.model.PaymentForVISA;

public interface PaymentVisaListService {
	List<PaymentForVISA> getAllVDetails();

	PaymentForVISA getVISASummeryById(int id);

	void deleteVISAById(int id);
}
