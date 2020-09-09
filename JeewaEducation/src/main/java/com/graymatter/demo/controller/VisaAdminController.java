package com.graymatter.demo.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VisaAdminController {

	@RequestMapping("/admin/visa")
	public String VisaAdminLogin() {
		return "visa/visa_admin_login";
	}
	
	@RequestMapping("/admin/visa-dashboard")
	public String VisaAdminDashboard() {
		return "visa/visa_dashboard";
	}
	
	@RequestMapping("/admin/visa-pendingstudents")
	public String VisaPendingStudent() {
		return "visa/visa_pending_student";
	}
	
	@RequestMapping("/admin/adminlogin")
	public void loginAuthentication(HttpServletRequest req, HttpServletResponse res ) throws IOException {
		
		HttpSession session1 = req.getSession();
		
		String name = req.getParameter("username");
		String psw = req.getParameter("password");
		
		if(name.equals("admin")&&psw.equals("abcd")) {
			
			//String visaid = service.findByUserName(name).getId();
			
			session1.setAttribute("name", name);
			
			res.sendRedirect("/admin/visa-dashboard");
			
		}else {
			res.sendRedirect("/admin/visa");
		}
		
	}
	
	
}

