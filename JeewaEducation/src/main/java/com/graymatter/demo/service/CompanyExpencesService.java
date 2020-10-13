package com.graymatter.demo.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import com.graymatter.demo.model.CompanyExpences;
import com.graymatter.demo.model.CompanyIncomes;
import com.graymatter.demo.repo.CompanyExpencesRepo;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Transactional
@Service
public class CompanyExpencesService implements PaymentExpenceListService{
	
	@Autowired
	CompanyExpencesRepo repo;
	
	public void addExpences(CompanyExpences companyexpences) {
		repo.save(companyexpences);
	}
	
	@Override
	public List<CompanyExpences> getAllVDetails(){
		return repo.findAll();
	}

	@Override
	public void deleteExpencesById(int id) {
		this.repo.deleteById(id);
		
	}

	@Override
	public CompanyExpences getExpensesById(int id) {
		Optional <CompanyExpences> optional= repo.findById(id);
		CompanyExpences companyExpences = null;
		if(optional.isPresent()) {
			companyExpences = optional.get();
		}else {
			throw new RuntimeException("Expences type is not found for id :: "+ id);
		}
		return companyExpences;
	}

	@Override
	public Long sumExpences() {
		
		return repo.sumExpences();
	}
	
	public String exportExpencesReport(String reportFormat) throws FileNotFoundException, JRException {
		List<CompanyExpences> companyExpences = repo.findAll();
		//Load files and compile it 
		File file = ResourceUtils.getFile("classpath:report.jrxml");
		JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(companyExpences);
		Map<String,Object> parameters = new HashMap<>();
		parameters.put("CreatedBy", "Payment Administrator");
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters,dataSource);
		if(reportFormat.equalsIgnoreCase("pdf")) {
			JasperExportManager.exportReportToPdfFile(jasperPrint,"C:\\Users\\navod\\Desktop\\Report\\Expence Reports"+"\\CompanyExpenceList.pdf");
		}
		return "Report is genarated in path :" + "C:\\Users\\navod\\Desktop\\Report\\Expence Reports";
		
	}
}
