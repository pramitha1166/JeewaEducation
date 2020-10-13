package com.graymatter.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.graymatter.demo.model.Response;
import com.graymatter.demo.model.VisaApplication;
import com.graymatter.demo.service.VisaApplicationService;

@RestController
@RequestMapping("/admin/visa-applications")
public class VisaApplicationAdminRestController {

	@Autowired
	VisaApplicationService service;
	
	@PostMapping(value = "/{id}",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response submitApplication(@Valid @RequestBody VisaApplication application,@PathVariable("id") Integer id) {
		
		
		service.addVisaApplication(application);
		
		Response response = new Response("Done",application);
		
		return response;
		
	}
	
}
