package com.graymatter.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graymatter.demo.model.PendingStudents;

import com.graymatter.demo.repo.PendingStudentsRepo;

@Service
public class PendingStudentsService implements pedstuservice {
	
	@Autowired
	PendingStudentsRepo repo;
	
	public void addStudents(PendingStudents pendingstudents) {
		repo.save(pendingstudents);	
	}
	
	
	public List<PendingStudents> listAll(){
			
		return repo.findAll();
	}
	
	
	  public void deleteStudentsById(int id){
		  this.repo.deleteById(id);
	  	
	  }
	 

}
