package com.graymatter.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graymatter.demo.model.StudentHall;
import com.graymatter.demo.repo.StudentHallRepo;

@Service
public class SHallService implements StudentHallService{

	@Autowired
	StudentHallRepo repo;
	
	public void addSHall(StudentHall studenthall) {
		
		repo.save(studenthall);
	}
	
	@Override
	public List<StudentHall> getAllStudentHall() {
		
		return repo.findAll();
	}

	@Override
	public void deleteShallById(StudentHall studenthall) {
		this.repo.delete(studenthall);
		
	}

}
