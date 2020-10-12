package com.graymatter.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graymatter.demo.model.Studenttimetable;
import com.graymatter.demo.repo.StudenttimetableRepo;

@Service
public class Stimetableservice implements StudenttimetableService {

	@Autowired
	StudenttimetableRepo repo;
	
	public void addStimetable(Studenttimetable stimetable) {
		
		repo.save(stimetable);
	}
	
	@Override
	public List<Studenttimetable> getAllStudenttimetable(){
		return repo.findAll();
	}

	@Override
	public void deleteStimetableById(Studenttimetable stimetable) {
		this.repo.delete(stimetable);
		
	}

	@Override
	public Studenttimetable getStimetableById(int stimetableID) {
		Optional<Studenttimetable> optional= repo.findById(stimetableID);
		Studenttimetable stimetable = null;
		if(optional.isPresent()) {
			stimetable = optional.get();
		}else {
			throw new RuntimeException("Student timetable not found id"+stimetableID);
		}
		return stimetable;
		
		
		
	}

	


}
