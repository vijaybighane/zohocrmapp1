package com.zohocrm1.service;

import java.util.List;

import com.zohocrm1.entities.Lead;

public interface LeadService {
	public void saveOneLead(Lead lead);
	public Lead getLeadById(long id);
	public void deleteLeadById(long id);
	public List<Lead> getAllLeads();
 
}
