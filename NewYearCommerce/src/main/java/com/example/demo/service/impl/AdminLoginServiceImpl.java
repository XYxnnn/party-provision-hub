package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Admin;
import com.example.demo.repository.AdminLoginRepository;
import com.example.demo.service.AdminLoginService;

@Service
public class AdminLoginServiceImpl implements AdminLoginService
{
	@Autowired
	private AdminLoginRepository adminRepository;
	
	//Validating Admin login
	public boolean validateAdminCredentials(String email, String password)
	{
		Admin admin=adminRepository.findByEmail(email);
		if(admin!=null && admin.getPassword().equals(password))
		{
			return true;
		}
		return false;
	}
}