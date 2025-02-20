package com.example.demo.service;

import com.example.demo.entity.CustomerLogin;

public interface CustomerLoginService
{
	
	//Get Single User By Email
	public CustomerLogin getCustomerByEmail(String email);
		
	//Validating Customer login
	public boolean validateCustomerCredentials(String email,String password);

}