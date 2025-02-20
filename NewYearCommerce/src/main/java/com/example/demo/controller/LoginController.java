package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Admin;
import com.example.demo.entity.CustomerLogin;
import com.example.demo.service.AdminLoginService;
import com.example.demo.service.CustomerLoginService;
import com.example.demo.service.InventoryManageService;


@Controller
public class LoginController {
	
	@Autowired
	private CustomerLoginService clService;
	@Autowired
	private AdminLoginService alServices;
	
	CustomerLogin customer;
	
	public LoginController(CustomerLoginService clService, AdminLoginService alServices) {
		super();
		this.clService = clService;
		this.alServices = alServices;

	}
	
	/*
	@GetMapping("/adminLogin")
	public String customerLoginGET( @ModelAttribute("customerLogin") CustomerLogin login, Model model)
	{

		String email=login.getEmail();
		String password=login.getPassword();
		if(clService.validateCustomerCredentials(email, password))
		{
			customer = this.clService.getCustomerByEmail(email);
			// List<Orders> orders = this.orderServices.getOrdersForUser(user);
			// model.addAttribute("orders", orders);
			// model.addAttribute("name", customer.getName());
			return "home";
		}
		else
		{
			//model.addAttribute("error2", "Invalid email or password");
			return "login";
		}
	}
	*/
	
	@PostMapping("/adminLogin")
	public String adminLogin(
			@RequestParam(value="email") String email,
			@RequestParam(value="password") String password,
			Model model
			) {
		if(alServices.validateAdminCredentials(email, password)) { 
			return "inventory_management";
		}
		else {
			model.addAttribute("error", "Invalid email or password");
			return "login";
		}
	}
	
	/*
	@GetMapping("/customerLogin")
	public String customerLoginGET( @ModelAttribute("customerLogin") CustomerLogin login, Model model)
	{

		String email=login.getEmail();
		String password=login.getPassword();
		if(clService.validateCustomerCredentials(email, password))
		{
			customer = this.clService.getCustomerByEmail(email);
			// List<Orders> orders = this.orderServices.getOrdersForUser(user);
			// model.addAttribute("orders", orders);
			// model.addAttribute("name", customer.getName());
			return "home";
		}
		else
		{
			//model.addAttribute("error2", "Invalid email or password");
			return "login";
		}
	}
	*/
	
	@PostMapping("/customerLogin")
	public String customerLogin(
			@RequestParam(value="email") String email,
			@RequestParam(value="password") String password,
			Model model
			) {
		if(clService.validateCustomerCredentials(email, password)) { 
			customer = this.clService.getCustomerByEmail(email);
			return "home";
		}
		else {
			model.addAttribute("error", "Invalid email or password");
			return "login";
		}
	}
}
