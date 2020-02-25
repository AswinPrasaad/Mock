package com.mak.service;

import java.util.List;

import com.mak.model.Customer;

public interface CustomerService {
	public void saveCustomer(Customer customer);
	public List<Customer> showCustomer();
}
