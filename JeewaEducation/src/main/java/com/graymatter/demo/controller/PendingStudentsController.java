package com.graymatter.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.graymatter.demo.model.PendingStudents;
import com.graymatter.demo.service.PendingStudentsService;


import java.util.List;

@Controller
public class PendingStudentsController {
	
	@Autowired
	PendingStudentsService service;
	
	@PostMapping(value = "/submitdetails")
	public String addStudents(PendingStudents pendingstudents) {
		service.addStudents(pendingstudents);
		return "home";
	}	
		
		
	 @GetMapping("/pending_delete/{pending_id}")
	  public String delete(@PathVariable(value="id") int pending_id){
	  	return "redirect:/";
	  }
	 
	
	
	
	@RequestMapping("/admin/student-dashboard")
	public String viewPendingStudentss(Model model){

		List<PendingStudents> listProducts = service.listAll();
		model.addAttribute("listProducts",listProducts);
		if(listProducts.isEmpty())
			System.out.println("Empty");
		for(PendingStudents ps: listProducts) {
			System.out.println(ps);
		}

		return "pending-stud";
	}
	
	
	
	/**@GetMapping("/")
    public String findCities(Model model) {

        var cities = (List<PendingStudents>) service.findAll();

        model.addAttribute("cities", cities);

        return "student_dashboard";
    }*/
	
	/**
	@RequestMapping("/")
	public String viewpendstud(Model model){

	List<PendingStudents> listProducts = service.listAll();
	model.addAttribute("listProducts",listProducts);

	return"student_dashboard";
	}*/
	
	
		
		
		
	
	
	

}
