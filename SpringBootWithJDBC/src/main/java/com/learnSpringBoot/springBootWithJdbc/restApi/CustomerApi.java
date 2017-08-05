package com.learnSpringBoot.springBootWithJdbc.restApi;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.learnSpringBoot.springBootWithJdbc.model.Customer;


@RestController
public interface CustomerApi {
	
	@RequestMapping(method=RequestMethod.GET,value="/Customer")
	public List<Customer> getAllCustomers();
	
	@RequestMapping(method = RequestMethod.POST,value = "/Customer")
	public void addCustomer(@RequestBody Customer customer);
}
 