package com.zohocrm1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm1.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
