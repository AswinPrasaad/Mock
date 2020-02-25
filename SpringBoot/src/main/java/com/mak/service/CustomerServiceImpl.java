package com.mak.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mak.dao.CustomerDao;
import com.mak.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	
	@Autowired
	private CustomerDao customerDao;
	
	public void saveCustomer(Customer customer){
		customerDao.save(customer);
	}
	@Override
	public List<Customer> showCustomer() {
		return (List<Customer>) customerDao.findAll();
	}
}
