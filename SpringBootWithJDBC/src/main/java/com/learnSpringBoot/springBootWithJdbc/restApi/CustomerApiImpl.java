package com.learnSpringBoot.springBootWithJdbc.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.learnSpringBoot.springBootWithJdbc.model.Customer;
import com.learnSpringBoot.springBootWithJdbc.service.CustomerService;


@RestController
public class CustomerApiImpl implements CustomerApi{
	
	@Autowired 
	private CustomerService customerService;
	
	public CustomerApiImpl() {
		
	}

	@Override
	public List<Customer> getAllCustomers() {
		
		return null;
	}

	@Override
	public void addCustomer(Customer customer) {
		
		
	}
	
	
}
