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
	/*
	@Modifying
	@Query(value = "insert into pendingforvisa (city,country,dob,email,fname,gender,lname,other,state,zip,usernamefk) values (:city, :country, :dob, :email, :fname, :gender, :lname, :other, :state, :zip, :usernamefk)", nativeQuery = true)
	void insertVisa(@Param("city") String city, @Param("country") String country, @Param("dob") String dob, @Param("email") String email, @Param("fname") String fname,@Param("gender") String gender,@Param("lname") String lname,@Param("other") String other, @Param("state") String state,@Param("zip") String zip,@Param("usernamefk") String usernamefk);
	*/
	
	
	
}
