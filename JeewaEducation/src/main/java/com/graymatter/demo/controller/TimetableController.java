package com.graymatter.demo.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TimetableController {

	@RequestMapping("/admin/timetable")
	public String admintimetable() {
		return "timetable/studenttimetable";
	}
	
	@RequestMapping("/admin/timetable-lecturer")
	public String Lecturertimetable() {
		return "timetable/lecturertimetable";
	}
	
	@RequestMapping("/admin/timetable-hall")
	public String Studenthall() {
		return "timetable/studenthallarrangements";
	}
	
	@RequestMapping("/admin/timetable-submit")
	public String Timetablesubmit() {
		return "timetable/timetablesubmit";
	}
	
	
}
