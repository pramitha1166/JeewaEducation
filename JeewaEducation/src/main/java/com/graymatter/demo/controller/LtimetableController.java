package com.graymatter.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.graymatter.demo.model.Lecturertimetable;
import com.graymatter.demo.model.Studenttimetable;
import com.graymatter.demo.service.LtimetableService;

@Controller
public class LtimetableController {

	@Autowired
	LtimetableService service;
	

	@PostMapping("/admin/save2")
	public String addLtimetable(Lecturertimetable ltimetable) {
		service.addLtimetable(ltimetable);
		return "redirect:/admin/timetable-lecturer";
	}
	@GetMapping("/admin/timetable-lecturer")
	public String viewLtimetable(Model model1) {
		
		model1.addAttribute("listlecturertimetable",service.getAllLecturertimetable());
		return "timetable/lecturertimetable";
	}
	
	@RequestMapping("/admin/deleteLtimetable")
	public String deleteLtimetable(Lecturertimetable ltimetable) {
		service.deleteLtimetableById(ltimetable);
		return "redirect:/admin/timetable-lecturer";
	}
	
}
