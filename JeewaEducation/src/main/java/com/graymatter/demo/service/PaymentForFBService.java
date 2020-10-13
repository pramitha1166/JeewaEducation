package com.graymatter.demo.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import com.graymatter.demo.model.PaymentForFB;
import com.graymatter.demo.model.PaymentForVISA;
import com.graymatter.demo.repo.PaymentForFBRepo;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

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
	@Override
	public void deleteFBById(int id) {
		this.repo.deleteById(id);
		
	}
	
	public String exportFBReport(String reportFormat) throws FileNotFoundException, JRException {
		List<PaymentForFB> paymentForFB = repo.findAll();
		//Load files and compile it 
		File file = ResourceUtils.getFile("classpath:fg.jrxml");
		JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(paymentForFB);
		Map<String,Object> parameters = new HashMap<>();
		parameters.put("CreatedBy", "Payment Administrator");
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters,dataSource);
		if(reportFormat.equalsIgnoreCase("html")) {
			JasperExportManager.exportReportToHtmlFile(jasperPrint,"C:\\Users\\navod\\Desktop\\Report\\FB Payments Reports"+"\\FBPaymentList.html");
		}
		if(reportFormat.equalsIgnoreCase("pdf")) {
			JasperExportManager.exportReportToPdfFile(jasperPrint,"C:\\Users\\navod\\Desktop\\Report\\FB Payments Reports"+"\\FBPaymentList.pdf");
		}
		return "Report is genarated in path :" + "C:\\Users\\navod\\Desktop\\Report\\FB Payments Reports";
		
	}
}
