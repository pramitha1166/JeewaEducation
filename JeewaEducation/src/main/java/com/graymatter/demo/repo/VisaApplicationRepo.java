package com.graymatter.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.graymatter.demo.model.VisaApplication;
import com.graymatter.demo.model.VisaStudent;

@Repository
public interface VisaApplicationRepo extends JpaRepository<VisaApplication, Integer> {

	List<VisaApplication> findByCity(String city);
	
	VisaApplication findByStudentid(String stdid);
	
}
