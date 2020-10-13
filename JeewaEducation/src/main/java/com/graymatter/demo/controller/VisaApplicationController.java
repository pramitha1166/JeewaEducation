package com.graymatter.demo.controller;

import java.net.http.HttpRequest;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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
		
	//	boolean result = service.checkVisaApplicationAvailable(visastd.getId());
		
		//if(result==true) {
			//return "redirect:/profile/visa/profile_01";
		//}else {
			
			List<String> marrageList = Arrays.asList("Married","Not-Married","Engaged");
			req.setAttribute("marrageList",marrageList);
			
	
			List<String> genderList = Arrays.asList("male","female");
			req.setAttribute("genderList",genderList);
			
			req.setAttribute("visastd", visastd);
			
			model.addAttribute("application", new VisaApplication());
			return "visa/profile/submit_visa_application";
		
		//}
		
	}
	/*
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
	*/
	
	
	
	@RequestMapping(value = "/admin/visa-applications/{pendingforvisa.id}")
	public String updateVisaApplication(@Valid @ModelAttribute("application") VisaApplication application,@RequestParam int id) {
		
		
		service.addVisaApplication(application);
		
		return "redirect:/admin/visa-applications";
	}
	
	@RequestMapping(value = "/profile/visa/update")
	public String updateVisaAtProfile(@Valid @ModelAttribute("application") VisaApplication application,@RequestParam int id) {
		service.deletePendingVisa(id);
		service.addVisaApplication(application);
		return "redirect:/profile/visa/update?id="+id;
	}
	
	
	
	
	@GetMapping(value = "/admin/visa-applications")
	public String listAllPendingVisa(HttpServletRequest req) {
		
		List<VisaApplication> listApplications = service.listAllVisaApplications();
		
		req.setAttribute("pendingvisa", listApplications);
		
		return "visa/pendingvisa";
	}
	
	
	@RequestMapping("/admin/deleteVisaApplication")
	public String deletePendingVisa(@RequestParam int id) {
		service.deletePendingVisa(id);
		return "redirect:/admin/visa-applications";
	}
	
	
	@GetMapping(value = "/admin/visa-applications/{pendingforvisa.id}")
	public String getPendingVisaById(@PathVariable(name="pendingforvisa.id") Integer id, ModelMap model,HttpServletRequest req) {
		
		//ModelAndView mv = new ModelAndView("pendingforvisa");
		
		VisaApplication application = service.getVisaById(id);
		
		req.setAttribute("pendingvisa", application);
		
		model.addAttribute("application",application);
		//req.setAttribute("pendingvisa", penvisa);
		
		//mv.addObject("pendingvisa",penvisa);
		
		return "visa/viewvisastudent";
	}
	
	
}
