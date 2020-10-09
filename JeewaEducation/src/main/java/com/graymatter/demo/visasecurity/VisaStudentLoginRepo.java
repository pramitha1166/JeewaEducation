package com.graymatter.demo.visasecurity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.graymatter.demo.model.VisaStudent;

@Repository
public interface VisaStudentLoginRepo extends JpaRepository<VisaStudent, Integer> {
	VisaStudent findByUsername(String username);
}
