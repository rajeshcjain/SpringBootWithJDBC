package com.learnSpringBoot.springBootWithJdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.learnSpringBoot.springBootWithJdbc.model.Customer;

@Repository
public class CustomerDaoImpl implements CustomDao{
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Customer> findAll() {

		return null;
	}

	@Override
	public void addCustomer(Customer customer) {
		
	}

}
