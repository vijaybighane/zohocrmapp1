package com.zohocrm1.service;

import java.util.List;

import com.zohocrm1.entities.Billing;

public interface BillingService {
	public void generateBill(Billing bill);

	List<Billing> getBilling();

}
