package com.graymatter.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graymatter.demo.model.VisaApplication;
import com.graymatter.demo.model.VisaStudent;
import com.graymatter.demo.repo.VisaApplicationRepo;
import com.graymatter.demo.repo.VisaStudentRepo;

@Service
public class VisaApplicationService {

	@Autowired
	VisaApplicationRepo repo;
	
	@Autowired
	VisaStudentRepo repo1;
	
	public VisaApplication findByStudentid(String stdid) {
		return repo.findByStudentid(stdid);
	}
	
	public VisaApplication addVisaApplication(VisaApplication application) {
		return repo.save(application);
	}
	
	public VisaApplication getVisaById(int visaid) {
		return repo.findById(visaid).get();
	}
	
	public VisaStudent getVisaByUsername(String username) {
		return repo1.findByUsername(username);
	}
	
	public List<VisaApplication> findByCity(String city) {
		return repo.findByCity(city);
	}
	
	public List<VisaApplication> listAllVisaApplications() {
		return repo.findAll();
	}
	
	public void deletePendingVisa(int id) {
		repo.deleteById(id);
	}
	
	public boolean checkVisaApplicationAvailable(String stdid) {
		
		VisaApplication visaApplication = repo.findByStudentid(stdid);
		
		if(visaApplication!=null) {
			return true;
		}else {
			return false;
		}
		
	}
	
}
