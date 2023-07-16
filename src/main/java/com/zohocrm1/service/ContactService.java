package com.zohocrm1.service;

import java.util.List;

import com.zohocrm1.entities.Contact;

public interface ContactService {
	public void saveContact(Contact contact);

	List<Contact> getContacts();

	public Contact getContactById(long id);

}
