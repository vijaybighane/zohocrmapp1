package com.zohocrm1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm1.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
