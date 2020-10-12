package com.graymatter.demo.service;

import java.util.List;
import com.graymatter.demo.model.Studenttimetable;

public interface StudenttimetableService {

	List<Studenttimetable> getAllStudenttimetable();
	
	void deleteStimetableById(Studenttimetable stimetable);
	
	Studenttimetable getStimetableById(int stimetableID);
}
