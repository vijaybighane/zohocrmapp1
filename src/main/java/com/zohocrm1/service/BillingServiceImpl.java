package com.zohocrm1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm1.entities.Billing;
import com.zohocrm1.repository.BillingRepository;

@Service
public class BillingServiceImpl implements BillingService {
	
	@Autowired
	private BillingRepository billingRepo;

	@Override
	public void generateBill(Billing bill) {
		billingRepo.save(bill);
	}

	@Override
	public List<Billing> getBilling() {
		List<Billing> billing = billingRepo.findAll();
		return billing;
	}
}
