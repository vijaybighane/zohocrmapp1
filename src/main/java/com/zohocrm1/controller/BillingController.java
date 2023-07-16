package com.zohocrm1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrm1.entities.Billing;
import com.zohocrm1.service.BillingService;

@Controller
public class BillingController {
	
	@Autowired
	private BillingService billingService;
	
	@RequestMapping("/listbilling")
	public String listBilling(Model model) {
		List<Billing> billing = billingService.getBilling();
			model.addAttribute("billing", billing);
			return "list_bills";
		}
}
