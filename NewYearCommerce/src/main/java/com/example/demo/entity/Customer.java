package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="customer_name", nullable=false)
	private String name;
	
	@Column(name="customer_email", nullable=false)
	private String email;
	
	@Column(name="customer_password", nullable=false)
	private String password;

	@Column(name="customer_address", nullable=false)
	private String shipping_address;
	
	@Column(name="customer_mobile", nullable=false)
	private String mobile;

	Customer() {}
	
	public Customer(String name, String email, String password, String shipping_address, String mobile) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.shipping_address = shipping_address;
		this.mobile = mobile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getShipping_address() {
		return shipping_address;
	}

	public void setShipping_address(String shipping_address) {
		this.shipping_address = shipping_address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
}
