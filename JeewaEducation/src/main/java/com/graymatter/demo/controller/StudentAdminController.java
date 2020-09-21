package com.graymatter.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.graymatter.demo.model.PendingStudents;
import com.graymatter.demo.service.PendingStudentsService;

@Controller
public class StudentAdminController {
	@Autowired
	PendingStudentsService service;

	@GetMapping("/admin/student-dashboard")
	public String studentDash() {
		return "student/student_dashboard";
	}
	
	@GetMapping("/student-register")
	public String register() {
		return "student/student_reg_form";
	}
	
	
	@GetMapping("/student-feedback")
	public String feedback() {
		return "student/studentreplyform";
	}

	
	
	@GetMapping("/student_profile")
	public String studentprofile() {
		return "student/stud_profile";
	}
	
	
	
	@GetMapping("/contact_admin")
	public String conadmin() {
		return "student/ContactAdmin";
	}
	
	@GetMapping("/view-pending-stud")
	public String viewPendingStud() {
		return "student/viewpendingstudent";
	}
	
	@GetMapping("/admin/view-foundation-stud")
	public String viewFoundationStud() {
		return "student/viewfoundationstudents";
	}
	
	
	@GetMapping("/pending_delete")
	public String deletePending() {
		return "student/DeletePending";
	}
	
	@GetMapping("/admin/foundation-stud")
	public String FoundationStud() {
		return "student/foundationstudents";
	}
	
	
	@GetMapping("/admin/student_report")
	public String ReportStud() {
		return "student/StudentReports";
	}
	
	
	@GetMapping("/pending-stud")
	public String PendingStud(Model model) {
		List<PendingStudents> listProducts = service.listAll();
		model.addAttribute("listProducts",listProducts);
		
		for(PendingStudents ps: listProducts) {
			System.out.println(ps);
		}
		return "student/pendingstudents";
	}
}
