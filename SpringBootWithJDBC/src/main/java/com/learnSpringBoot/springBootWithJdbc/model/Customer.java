package com.learnSpringBoot.springBootWithJdbc.model;

public class Customer {
	
	String id;
	String firstName;
	String lastName;
	String address;
	
	public Customer() {
		
	}
	
	public Customer(String id,String firstName,String lastName,String address) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	
	public String getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getAddress() {
		return address;
	}

	public String getLastName() {
		return lastName;
	}


}
