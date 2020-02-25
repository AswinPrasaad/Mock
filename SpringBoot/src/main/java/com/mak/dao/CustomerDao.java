package com.mak.dao;

import org.springframework.data.repository.CrudRepository;

import com.mak.model.Customer;

public interface CustomerDao extends CrudRepository<Customer, Integer>{

	
	
}
