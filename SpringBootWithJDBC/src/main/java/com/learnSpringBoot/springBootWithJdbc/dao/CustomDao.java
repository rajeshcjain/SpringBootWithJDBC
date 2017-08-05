package com.learnSpringBoot.springBootWithJdbc.dao;

import java.util.List;

import com.learnSpringBoot.springBootWithJdbc.model.Customer;

public interface CustomDao {
	
	public List<Customer> findAll();

	public void addCustomer(Customer customer);
	
}
