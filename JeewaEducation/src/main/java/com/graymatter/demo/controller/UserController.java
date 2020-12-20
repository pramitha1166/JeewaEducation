package com.graymatter.demo.controller;

import java.awt.PageAttributes.MediaType;
import java.io.IOException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.graymatter.demo.model.Response;
import com.graymatter.demo.model.User;
import com.graymatter.demo.model.UserResponse;
import com.graymatter.demo.service.UserService;

@RestController
@RequestMapping("/apply")
public class UserController {

	@Autowired
	UserService service;
	
	@RequestMapping(value = "/savestudent", method = RequestMethod.POST)
	public UserResponse addUser(@Valid @RequestBody User student) throws IOException {
		
		service.addUser(student);
		
		UserResponse response = new UserResponse("Done", student);
				
		return response;
	}
	
}
