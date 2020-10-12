package com.graymatter.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graymatter.demo.model.Lecturertimetable;
import com.graymatter.demo.repo.LecturertimetableRepo;


@Service
public class LtimetableService  implements LecturertimetableService {

	@Autowired
	LecturertimetableRepo repo;
	
	public void addLtimetable(Lecturertimetable ltimetable) {
		repo.save(ltimetable);
	}

	@Override
	public List<Lecturertimetable> getAllLecturertimetable() {
		
		return repo.findAll();
	}

	@Override
	public void deleteLtimetableById(Lecturertimetable ltimetable) {
		this.repo.delete(ltimetable);
		
	}

}
