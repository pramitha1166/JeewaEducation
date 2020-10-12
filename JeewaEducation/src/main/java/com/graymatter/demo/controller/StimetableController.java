package com.graymatter.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.graymatter.demo.model.Studenttimetable;

import com.graymatter.demo.service.Stimetableservice;

@Controller
public class StimetableController {
	
	@Autowired
	Stimetableservice service;

	
	@PostMapping("/admin/save1")
	public String addStimetable(Studenttimetable stimetable) {
		service.addStimetable(stimetable);
		return "redirect:/admin/timetable";
	}
	
	@GetMapping("/admin/timetable")
	public String viewStimetable(Model model) {
		
		model.addAttribute("liststudenttimetable",service.getAllStudenttimetable());
		return "timetable/studenttimetable";
	}
	
	@RequestMapping("/admin/deleteStimetable")
	public String deleteStimetable(Studenttimetable stimetable) {
		service.deleteStimetableById(stimetable);
		return "redirect:/admin/timetable";
	}
	
	@GetMapping("/admin/updateStimetable")
	public String formForUpdate(@RequestParam int stimetableID, Model model) {
		
		Studenttimetable stimetable= service.getStimetableById(stimetableID);
		
		model.addAttribute("stimetable",stimetable);
		return "timetable/updateStimetable";
		
	}
}
