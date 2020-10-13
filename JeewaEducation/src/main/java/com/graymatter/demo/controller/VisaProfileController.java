package com.graymatter.demo.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.graymatter.demo.model.VisaApplication;
import com.graymatter.demo.model.VisaStudent;
import com.graymatter.demo.model.VerifiedVisa;
import com.graymatter.demo.service.VisaApplicationService;
import com.graymatter.demo.service.VisaStudentService;
import com.graymatter.demo.service.VerifiedVisaService;

@Controller
public class VisaProfileController {

	@Autowired
	VisaStudentService service;
	
	
	@Autowired
	VisaApplicationService service1;
	
	@Autowired
	VerifiedVisaService service2;
	
	@GetMapping("/profile/visa/dashboard")
	public String visaDashboard() {
		return "visa/profile/dashboard";
	}
	/*
	@GetMapping("/profile/visa/accept")
	public String acceptTems(@RequestParam String username, HttpServletRequest req) {
		
		VisaStudent visastd = service.findByUser(username);
		
		req.setAttribute("visastudent", visastd);
		
		return "visa/profile/visaaccess01";
	}*/
	
	
	
	@RequestMapping(value = "/profile/visa/accessvisa", method = RequestMethod.GET)
	public void visaprofile01(@RequestParam String username, HttpServletResponse response) {
		
		
		VisaStudent visastd = service.findByUser(username);
		
		VisaApplication application = service1.findByStudentid(visastd.getId());
		
		VerifiedVisa veristd = service2.findByStudentid(visastd.getId());
		
	/*	System.out.println(visastd.getId());
		System.out.println(veristd);
		System.out.println(application);
		
		System.out.println(visastd);
		System.out.println(application.getStatus());
		
		System.out.println(application.getStatus()=="not-verified");
		System.out.println(application==null);
		
		System.out.println(veristd==null  && application.getStatus().equals("verified"));
		
		System.out.println(veristd==null);
		
		System.out.println(application.getStatus().equals("verified"));
		
		System.out.println(application==null || application.getStatus().equals("not-verified"));*/
		
		if (application==null || application.getStatus().equals("not-verified")) {
			try {
				response.sendRedirect("/profile/visa/profile_01");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//return "redirect:/profile/visa/profile_01";
		}else if(application.getStatus().equals("verified")) {
			try {
				response.sendRedirect("/profile/visa/profile_03");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
		
			try {
				response.sendRedirect("/");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	@GetMapping("/profile/visa/profile_02")
	public String visaprofile02() {
		return "visa/profile/visaprofile_02";
	}
	
	@GetMapping("/profile/visa/profile_01")
	public String visaprofile01() {
		return "visa/profile/visaprofile_01";
	}
	

	@GetMapping("/profile/visa/profile_03")
	public String visaprofile03() {
		return "visa/profile/visaprofile_03";
	}
	
	//@GetMapping("/profile/submitvisaapplication")
	//public String visaapplicationsubmit() {
		//return "visa/profile/submit_visa_application";
	//}
	
	@GetMapping("/profile/visa")
	public String visaProfileLogin() {
		return "visa/profile/visa_profile_login";
	}
	/*
	@RequestMapping("/profile/visa_login")
	public void loginAuthentication(HttpServletRequest req, HttpServletResponse res ) throws IOException {
		
		HttpSession session = req.getSession();
		
		String name = req.getParameter("username");
		String psw = req.getParameter("password");
		
		if(service.cheackLogin(name, psw)!=null) {
			
			//String visaid = service.findByUserName(name).getId();
			
			session.setAttribute("visauserid", service.cheackLogin(name, psw).getId());
			
			res.sendRedirect("/profile/visaprofile_01");
			
		}else {
			res.sendRedirect("/profile/visa");
		}
		
	}*/
	
	
	@RequestMapping(value = "/profile/visa/UpdateAplication", method = RequestMethod.GET)
	public String getVisaApplication(@RequestParam String username,Model model,HttpServletRequest req) {
		
		VisaStudent visaStudent = service.findByUser(username);
		
		VisaApplication visaApplication = service1.findByStudentid(visaStudent.getId());
		
		req.setAttribute("application", visaApplication);
		model.addAttribute("application", visaApplication);
		
		System.out.println(visaApplication);
		System.out.println(visaStudent);
		
		return "visa/profile/updateVisaApplication";
	}
	
	
	
}
