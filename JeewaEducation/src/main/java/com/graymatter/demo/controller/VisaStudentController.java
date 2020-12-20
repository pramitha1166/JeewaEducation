package com.graymatter.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.graymatter.demo.model.VisaApplication;
import com.graymatter.demo.model.VisaStudent;
import com.graymatter.demo.service.VisaApplicationService;
import com.graymatter.demo.service.VisaStudentService;

@RestController
@RequestMapping("/admin")
public class VisaStudentController {

	@Autowired
	VisaStudentService service;
	
	@Autowired
	VisaApplicationService service1;

	@GetMapping(value = "/visa-students")
	public ResponseEntity<List<VisaStudent>> listVisaStudent() {
		
		return new ResponseEntity<List<VisaStudent>>(service.listVisaStudent(), HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/visastudent-delete/{id}")
	public ResponseEntity<Void> deleteCompany(@PathVariable String id) {
		service.deleteVisaStudent(id);;
		return new ResponseEntity<Void>(HttpStatus.OK);
	} 
	
	@PostMapping(value = "/addapplication")
	public ResponseEntity<Void> addVisaStudent(VisaStudent student) {
		service.addVisaStudent(student);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
