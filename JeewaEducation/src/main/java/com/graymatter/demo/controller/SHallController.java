package com.graymatter.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.graymatter.demo.model.StudentHall;
import com.graymatter.demo.model.Studenttimetable;
import com.graymatter.demo.service.SHallService;

@Controller
public class SHallController {
	
	@Autowired
	SHallService service;

	@PostMapping("/admin/save3")
	public String addSHall(StudentHall studenthall) {
		service.addSHall(studenthall);
		return "redirect:/admin/timetable-hall";
	}
	
	@GetMapping("/admin/timetable-hall")
	public String viewSHall(Model model2) {
		
		model2.addAttribute("liststudenthall",service.getAllStudentHall());
		return "timetable/studenthallarrangements";
	}
	
	@RequestMapping("/admin/deleteShall")
	public String deleteShall(StudentHall studenthall) {
		service.deleteShallById(studenthall);
		return "redirect:/admin/timetable-hall";
	}
}
