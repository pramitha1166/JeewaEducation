package com.graymatter.demo.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import com.graymatter.demo.model.PaymentForVISA;
import com.graymatter.demo.repo.PaymentForVISARepo;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Service
public class PaymentForVISAService implements PaymentVisaListService {
	@Autowired
	PaymentForVISARepo repo;

	public void addPaymentForVISA(PaymentForVISA paymentForVISA) {
		repo.save(paymentForVISA);
	}

	@Override
	public List<PaymentForVISA> getAllVDetails() {
		return repo.findAll();
	}

	@Override
	public PaymentForVISA getVISASummeryById(int id) {
		Optional<PaymentForVISA> optional = repo.findById(id);
		PaymentForVISA paymentForVISA = null;
		if (optional.isPresent()) {
			paymentForVISA = optional.get();
		} else {
			throw new RuntimeException("Branch not found for id :: " + id);
		}
		return paymentForVISA;
	}

	@Override
	public void deleteVISAById(int id) {
		this.repo.deleteById(id);
	}
	
	public String exportVISAReport(String reportFormat) throws FileNotFoundException, JRException {
		List<PaymentForVISA> paymentForVISA = repo.findAll();
		//Load files and compile it 
		File file = ResourceUtils.getFile("classpath:fg.jrxml");
		JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(paymentForVISA);
		Map<String,Object> parameters = new HashMap<>();
		parameters.put("CreatedBy", "Payment Administrator");
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters,dataSource);
		if(reportFormat.equalsIgnoreCase("html")) {
			JasperExportManager.exportReportToHtmlFile(jasperPrint,"C:\\Users\\navod\\Desktop\\Report\\VISA Payments Reports"+"\\VISAPaymentList.html");
		}
		if(reportFormat.equalsIgnoreCase("pdf")) {
			JasperExportManager.exportReportToPdfFile(jasperPrint,"C:\\Users\\navod\\Desktop\\Report\\VISA Payments Reports"+"\\VISAPaymentList.pdf");
		}
		return "Report is genarated in path :" + "C:\\Users\\navod\\Desktop\\Report\\VISA Payments Reports";
		
	}
}
