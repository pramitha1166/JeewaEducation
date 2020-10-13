package com.graymatter.demo.controller;



import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Base64;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.util.StringUtils;

import com.graymatter.demo.model.Response;
import com.graymatter.demo.model.VisaApplication;
import com.graymatter.demo.service.VisaApplicationService;



@RestController
@RequestMapping("/profile/visa")
public class VisaApplicationRestController {

	@Autowired
	VisaApplicationService service;
	
	static String FILE_NAME = null;
	
	///profile/visa/SubmitAplication
	
	@PostMapping(value = "/save")
	public Response submitApplication(@Valid @RequestBody VisaApplication application) throws IOException {
		
		if(FILE_NAME!=null) {
		
			application.setMedical(FILE_NAME);
		
		}
		
		service.addVisaApplication(application);
		FILE_NAME = null;
		
		Response response = new Response("Done",application);
		
		return response;
		
	}
	
	@RequestMapping("/upload")
	public Response uploadFile(@RequestParam("fileUpload") MultipartFile multipartFile) throws IOException {
		
		String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
		

		FILE_NAME = Base64.getEncoder().encodeToString(multipartFile.getBytes());
		
		String uploadDir = "/medical-files/" + fileName;
		
		Path uploadPath = Paths.get(uploadDir);
		
		if(!Files.exists(uploadPath)) {
			try {
				Files.createDirectories(uploadPath);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try (InputStream inputStream = multipartFile.getInputStream()) {
			Path filePath = uploadPath.resolve(fileName);
			Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
		}catch(IOException e) {
			throw new IOException("Could not save uploaded file " + fileName);
		}
		
		Response response = new Response("Done");
		return response;
	}
	

	/*
	@PostMapping(value = "/save")
	public Response submitApplication(@RequestParam("Addfile") MultipartFile multipartFile,
			@RequestParam("fname") String fname,
			@RequestParam("lname") String lname,
			@RequestParam("other") String other,
			@RequestParam("email") String email,
			@RequestParam("dob") String dob,
			@RequestParam("city") String city,
			@RequestParam("state") String state,
			@RequestParam("zip") int zip,
			@RequestParam("marrage") String marrage,
			@RequestParam("country") String country,
			@RequestParam("studentid") String studentid,
			@RequestParam("status") String status
			) throws IOException {
		
		VisaApplication application = new VisaApplication();
		String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
		application.setMedical(fileName);
		application.setFname(fname);
		application.setLname(lname);
		application.setOther(other);
		application.setEmail(email);
		application.setCity(city);
		application.setState(state);
		application.setZip(zip);
		application.setMarrage(marrage);
		application.setCountry(country);
		application.setStudentid(studentid);
		application.setStatus(status);
		
		VisaApplication savedApplication = service.addVisaApplication(application);
		
		String uploadDir = "/medical-files/" + savedApplication.getId();
		
		Path uploadPath = Paths.get(uploadDir);
		
		if(!Files.exists(uploadPath)) {
			Files.createDirectories(uploadPath);
		}
		
		try (InputStream inputStream = multipartFile.getInputStream()) {
			Path filePath = uploadPath.resolve(fileName);
			Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
		}catch(IOException e) {
			throw new IOException("Could not save uploaded file " + fileName);
		}
		
		Response response = new Response("Done",application);
		
		return response;
		
	}
	
	*/
	
	@PutMapping(value = "/save")
	public Response updateApplication(@Valid @RequestBody VisaApplication application) {
		
		service.addVisaApplication(application);
		
		Response response = new Response("Done",application);
		return response;
	}

	@PostMapping(value = "/delete/{id}")
	public Response deleteApplication(@PathVariable Integer id) {
		
		service.deletePendingVisa(id);
		Response response = new Response("Done");
		return response;
	}
	
}
