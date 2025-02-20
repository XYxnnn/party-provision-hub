package com.example.demo.service;

public interface AdminLoginService
{
	//Validating Admin login
	public boolean validateAdminCredentials(String email,String password);

}