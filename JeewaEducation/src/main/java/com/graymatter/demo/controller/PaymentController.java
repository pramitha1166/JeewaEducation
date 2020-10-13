package com.graymatter.demo.controller;

import java.io.FileNotFoundException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.graymatter.demo.model.CompanyExpences;
import com.graymatter.demo.model.CompanyIncomes;
import com.graymatter.demo.model.PaymentForFB;
import com.graymatter.demo.model.PaymentForVISA;
import com.graymatter.demo.service.CompanyExpencesService;
import com.graymatter.demo.service.CompanyIncomesService;
import com.graymatter.demo.service.PaymentForFBService;
import com.graymatter.demo.service.PaymentForVISAService;

import net.sf.jasperreports.engine.JRException;

@Controller
public class PaymentController {
	@GetMapping("/admin/payment-dashboard")
	public String Payment_dashboard() {
		return "payment/paymentDashboard";
	}

	@GetMapping("/admin/payment-expences-AUD")
	public String Payment_expences_aud() {
		return "payment/paymentExpencesAUD";
	}

	@GetMapping("/admin/payment-income-AUD")
	public String Payment_income_aud() {
		return "payment/paymentIncomeAUD";
	}

	@GetMapping("/payment-form-VISA")
	public String Payment_front_visa() {
		return "payment/paymentFrontVISA";
	}

	@GetMapping("/payment-form-Foundation-Batch")
	public String Payment_front_fb() {
		return "payment/paymentFrontFB";
	}

	// company expenses controller
	@Autowired
	CompanyExpencesService expenceService;

	@PostMapping("admin/submitexpences")
	public String addExpences(CompanyExpences companyExpences) {
		expenceService.addExpences(companyExpences);
		return "redirect:/admin/payment-Expences-List";
	}

	@GetMapping("/admin/payment-Expences-List")
	public String viewExpencesList(Model model) {
		model.addAttribute("paymentexpencelist", expenceService.getAllVDetails());
		return "payment/paymentExpencesList";
	}
	
	@GetMapping("/admin/viewExpenceForUpdate")
	public String viewExpenceToUpdate(@RequestParam int id, Model model) {
		CompanyExpences companyExpences = expenceService.getExpensesById(id);
		model.addAttribute("companyExpences",companyExpences);
		return "payment/paymentExpencesAUD";
		
	}
	
	@PostMapping("admin/companyExpencesUpdate")
	public String updateExpences(CompanyExpences companyExpences) {
		expenceService.addExpences(companyExpences);
		return "redirect:/admin/payment-Expences-List";
	}

	@RequestMapping("/admin/deleteExpences")
	public String deleteExpences(@RequestParam int id) {
		expenceService.deleteExpencesById(id);
		return "redirect:/admin/payment-Expences-List";
	}

	// company income controller
	@Autowired
	CompanyIncomesService incomeService;

	@PostMapping("admin/submitincomes")
	public String addIncomes(CompanyIncomes companyIncomes) {
		incomeService.addIncomes(companyIncomes);
		return "redirect:/admin/payment-Income-List";
	}

	@GetMapping("/admin/payment-Income-List")
	public String viewIncomeList(Model model) {
		model.addAttribute("paymentincomelist", incomeService.getAllVDetails());
		return "payment/paymentIncomeList";
	}

	@RequestMapping("/admin/deleteIncomes")
	public String deleteIncomes(@RequestParam int id) {
		incomeService.deleteIncomesById(id);
		return "redirect:/admin/payment-Income-List";
	}

	@GetMapping("/admin/viewIncomesForUpdate")
	public String viewIncomeToUpdate(@RequestParam int id, Model model) {
		CompanyIncomes companyIncomes = incomeService.getIncomesById(id);
		model.addAttribute("companyIncomes",companyIncomes);
		return "payment/paymentIncomeAUD";
		
	}
	
	@PostMapping("admin/companyIncomesUpdate")
	public String updateIncomes(CompanyIncomes companyIncomes) {
		incomeService.addIncomes(companyIncomes);
		return "redirect:/admin/payment-Income-List";
	}
	
	/*@PostMapping(value="/admin/companyIncomesUpdate")
	public String updateIncomes(@RequestParam int id,CompanyIncomes companyIncomes, BindingResult result) {
		if(result.hasErrors()) {
			return "payment/paymentIncomeAUD";
		}
		incomeService.deleteIncomesById(id);
		incomeService.addIncomes(companyIncomes);
		return "redirect:/admin/payment-Income-List";
	}*/
	
	// Foundation batch payments
	@Autowired
	PaymentForFBService fbService;

	@PostMapping(value = "/submitfbpayments")
	public String addPaymentForFB(PaymentForFB paymentForFB) {
		fbService.addPaymentForFB(paymentForFB);
		return "redirect:/payment-summery";
	}

	@GetMapping("/admin/payment-FoundationBatch")
	public String viewFoundationBatchList(Model model) {
		model.addAttribute("listFBPayment", fbService.getAllVDetails());
		return "payment/paymentFB";
	}

	@RequestMapping("/admin/deleteFBPayment")
	public String deleteFB(@RequestParam int id) {
		fbService.deleteFBById(id);
		return "redirect:/admin/payment-FoundationBatch";
	}
	
	@GetMapping("/fbList/{format}")
	public String generateFBPaymentList(@PathVariable String format) throws FileNotFoundException, JRException {
		fbService.exportFBReport(format);
		return "redirect:/admin/payment-FoundationBatch";
	}

	// VISA payments
	@Autowired
	PaymentForVISAService visaService;

	@PostMapping(value = "/submitvisapayments")
	public String addPaymentForVISA(PaymentForVISA paymentForVISA) {
		visaService.addPaymentForVISA(paymentForVISA);
		return "redirect:/payment-summery";
	}

	
	 @GetMapping("/payment-summery") 
	 public String viewSummery(Model model) {
		 return "payment/paymentSummery"; 
	 }
	
	/*@GetMapping("admin/viewVISAForSummery")
	public String viewSummery(@RequestParam int id, Model model) {
		PaymentForVISA paymentForVISA = visaService.getVISASummeryById(id);
		model.addAttribute("paymentForVISA", paymentForVISA);
		return "payment/paymentSummery";
	}*/

	@GetMapping("/admin/payment-VISA")
	public String viewVISAList(Model model) {
		model.addAttribute("paymentvisalist", visaService.getAllVDetails());
		return "payment/paymentVISA";
	}

	@RequestMapping("/admin/deleteVISAPayment")
	public String deleteVISA(@RequestParam int id) {
		visaService.deleteVISAById(id);
		return "redirect:/admin/payment-VISA";
	}

	@GetMapping("/visaList/{format}")
	public String generateVisaPaymentList(@PathVariable String format) throws FileNotFoundException, JRException {
		visaService.exportVISAReport(format);
		return "redirect:/admin/payment-VISA";
	}
	// Report handling
	@GetMapping("/admin/payment-report")
	public String viewVListR(Model model) {
		model.addAttribute("paymentreportexpencelist", expenceService.getAllVDetails());
		model.addAttribute("paymenreporttincomelist", incomeService.getAllVDetails());
		return "payment/paymentReport";
	}

	@GetMapping("/incomeList/{format}")
	public String generateCompanyIncomeList(@PathVariable String format) throws FileNotFoundException, JRException {
		incomeService.exportIncomeReport(format);
		return "redirect:/admin/payment-report";
	}
	
	@GetMapping("/expenceList/{format}")
	public String generateCompanyExpenceList(@PathVariable String format) throws FileNotFoundException, JRException {
		expenceService.exportExpencesReport(format);
		return "redirect:/admin/payment-report";
	}
}