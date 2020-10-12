package com.graymatter.demo.service;

import java.util.List;

import com.graymatter.demo.model.StudentHall;



public interface StudentHallService {

	List<StudentHall> getAllStudentHall();
	
	void deleteShallById(StudentHall studenthall);
}
