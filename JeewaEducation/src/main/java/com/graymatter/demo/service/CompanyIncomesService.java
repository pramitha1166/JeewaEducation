package com.graymatter.demo.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import com.graymatter.demo.model.CompanyIncomes;
import com.graymatter.demo.model.PaymentForVISA;
import com.graymatter.demo.repo.CompanyIncomesRepo;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Service
public class CompanyIncomesService implements PaymentIncomeListService {

	@Autowired
	CompanyIncomesRepo repo;

	public void addIncomes(CompanyIncomes companyincomes) {
		repo.save(companyincomes);
	}

	@Override
	public List<CompanyIncomes> getAllVDetails() {
		return repo.findAll();
	}
	
	@Override
	public void deleteIncomesById(int id) {
		this.repo.deleteById(id);

	}

	@Override
	public CompanyIncomes getIncomesById(int id) {
		Optional <CompanyIncomes> optional= repo.findById(id);
		CompanyIncomes companyIncomes = null;
		if(optional.isPresent()) {
			companyIncomes = optional.get();
		}else {
			throw new RuntimeException("Income type is not found for id :: "+ id);
		}
		return companyIncomes;
	}
	
	public String exportIncomeReport(String reportFormat) throws FileNotFoundException, JRException {
		List<CompanyIncomes> companyIncomes = repo.findAll();
		//Load files and compile it 
		File file = ResourceUtils.getFile("classpath:report.jrxml");
		JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(companyIncomes);
		Map<String,Object> parameters = new HashMap<>();
		parameters.put("CreatedBy", "Payment Administrator");
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters,dataSource);
		if(reportFormat.equalsIgnoreCase("pdf")) {
			JasperExportManager.exportReportToPdfFile(jasperPrint,"C:\\Users\\navod\\Desktop\\Report\\Income Reports"+"\\CompanyIncomeList.pdf");
		}
		return "Report is genarated in path :" + "C:\\Users\\navod\\Desktop\\Report\\Income Reports";
		
	}
}
