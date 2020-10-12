package com.graymatter.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.graymatter.demo.model.StudentHall;


@Repository
public interface StudentHallRepo extends JpaRepository<StudentHall, Integer>{
	

}
