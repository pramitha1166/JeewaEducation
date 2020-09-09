package com.graymatter.demo.controller;

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

import com.graymatter.demo.model.PendingForVisa;
import com.graymatter.demo.service.PendingForVisaService;

@Controller
public class PendingForVisaController {

	@Autowired
	PendingForVisaService service;
	
	@RequestMapping(value = "/profile/submitpendingvisa", method = RequestMethod.GET)
	public String addVisaApplication(Model model) {
		model.addAttribute("pendingforvisa", new PendingForVisa());
		return "visa/profile/submit_visa_application";
		
	}
	
	@PostMapping(value = "/profile/pendingvisa")
	public String submitVisaApplication(@Valid @ModelAttribute("pendingforvisa") PendingForVisa pendingvisa, BindingResult result, ModelMap model, RedirectAttributes redirectAttributes) {
		
		if(result.hasErrors()) {
			return "visa/profile/submit_visa_application";
		}
		
		service.addPendingVisa(pendingvisa);
		
		return "visa/profile/submit_visa_application";
	}
	
	
	@PostMapping(value = "/admin/updatevisa")
	public String updateVisaApplication(@RequestParam int id,PendingForVisa pendingforvisa, BindingResult result) {
		
		if(result.hasErrors()) {
			return "visa/viewvisastudent";
		}
		
		service.deletePendingVisa(id);
		service.addPendingVisa(pendingforvisa);
		return "redirect:/admin/visa-pendinglist";
	}
	
	
	@GetMapping(value = "/admin/visa-pendinglist")
	public String listAllPendingVisa(HttpServletRequest req) {
		
		List<PendingForVisa> listpendingvisa = service.listAllPendingVisa();
		
		req.setAttribute("pendingvisa", listpendingvisa);
		
		return "visa/pendingvisa";
	}
	
	@GetMapping("/admin/visa-view")
	public String getVisaStudent() {
		return  "visa/viewvisastudent";
	}
	
	@RequestMapping("/admin/deletependingvisa")
	public String deletePendingVisa(@RequestParam int id) {
		service.deletePendingVisa(id);
		return "redirect:/admin/visa-pendinglist";
	}
	
	@RequestMapping(value = "/admin/pendingvisa")
	public String getPendingVisaById(@RequestParam int id, ModelMap model) {
		
		//ModelAndView mv = new ModelAndView("pendingforvisa");
		
		PendingForVisa penvisa = service.getVisaById(id);
		
		model.addAttribute("pendingforvisa",penvisa);
		//req.setAttribute("pendingvisa", penvisa);
		
		//mv.addObject("pendingvisa",penvisa);
		
		return "visa/viewvisastudent";
	}
	
}
