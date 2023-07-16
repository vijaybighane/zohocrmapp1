package com.zohocrm1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm1.entities.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long> {

}
