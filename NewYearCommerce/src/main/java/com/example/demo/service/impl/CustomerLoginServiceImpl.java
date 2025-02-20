package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CustomerLogin;
import com.example.demo.repository.CustomerLoginRepository;
import com.example.demo.service.CustomerLoginService;

@Service
public class CustomerLoginServiceImpl implements CustomerLoginService {
	
	@Autowired
	private CustomerLoginRepository customerRepository;
	
	//Get Single User By Email
	public CustomerLogin getCustomerByEmail(String email)
	{
		CustomerLogin customer=	this.customerRepository.findByEmail(email);
		return customer;
	}
		
	//Validating Customer login
	public boolean validateCustomerCredentials(String email,String password)
	{
		CustomerLogin customer=customerRepository.findByEmail(email);
		if(customer!=null && customer.getPassword().equals(password))
		{
			return true;
		}
		return false;
	}
}