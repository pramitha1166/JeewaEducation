package com.graymatter.demo.service;

import java.util.List;

import com.graymatter.demo.model.Lecturertimetable;
import com.graymatter.demo.model.Studenttimetable;


public interface LecturertimetableService {

	List<Lecturertimetable> getAllLecturertimetable();
	
	void deleteLtimetableById(Lecturertimetable ltimetable);
}
