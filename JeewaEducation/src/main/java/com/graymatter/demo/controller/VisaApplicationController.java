package com.graymatter.demo.controller;

import java.net.http.HttpRequest;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.graymatter.demo.model.VisaApplication;
import com.graymatter.demo.model.VisaStudent;
import com.graymatter.demo.service.VisaApplicationService;

@Controller
public class VisaApplicationController {

	@Autowired
	VisaApplicationService service;
	
	@RequestMapping(value = "/profile/visa/SubmitAplication", method = RequestMethod.GET)
	public String addVisaApplication(@RequestParam String username,Model model,HttpServletRequest req) {
		
		VisaStudent visastd = service.getVisaByUsername(username);
		
		req.setAttribute("visastd", visastd);
		
		model.addAttribute("application", new VisaApplication());
		return "visa/profile/submit_visa_application";
		
	}
	
	@PostMapping(value = "/profile/visa/SubmitAplication")
	public String submitVisaApplication(@Valid @ModelAttribute("application") VisaApplication application,@RequestParam String username, BindingResult result, ModelMap model,HttpServletRequest req, RedirectAttributes redirectAttributes) throws SQLIntegrityConstraintViolationException {
		try {
			if(result.hasErrors()) {
				return "visa/profile/submit_visa_application";
			}
			
			service.addVisaApplication(application);
			
			
			return "redirect:/profile/visa/profile_01?username="+username;
			
			//return "visa/profile/submit_visa_application";
		}catch(Exception ex) {

			return "visa/profile/submit_visa_application";
		}
	}
	
	
	@PostMapping(value = "/admin/VisaApplication/{penvisa.id}")
	public String updateVisaApplication(@RequestParam int id,VisaApplication application, BindingResult result) {
		
		if(result.hasErrors()) {
			return "visa/viewvisastudent";
		}
		
		service.deletePendingVisa(id);
		service.addVisaApplication(application);
		return "redirect:/admin/applications";
	}
	
	
	@GetMapping(value = "/admin/applications")
	public String listAllPendingVisa(HttpServletRequest req) {
		
		List<VisaApplication> listApplications = service.listAllVisaApplications();
		
		req.setAttribute("pendingvisa", listApplications);
		
		return "visa/pendingvisa";
	}
	
	
	@RequestMapping("/admin/deleteVisaApplication")
	public String deletePendingVisa(@RequestParam int id) {
		service.deletePendingVisa(id);
		return "redirect:/admin/applications";
	}
	
	
	@RequestMapping(value = "/admin/VisaApplication/{pendingforvisa.id}")
	public String getPendingVisaById(@PathVariable(name="pendingforvisa.id") Integer id, ModelMap model,HttpServletRequest req) {
		
		//ModelAndView mv = new ModelAndView("pendingforvisa");
		
		VisaApplication penvisa = service.getVisaById(id);
		
		req.setAttribute("pendingvisa", penvisa);
		
		model.addAttribute("pendingforvisa",penvisa);
		//req.setAttribute("pendingvisa", penvisa);
		
		//mv.addObject("pendingvisa",penvisa);
		
		return "visa/viewvisastudent";
	}
	
}
