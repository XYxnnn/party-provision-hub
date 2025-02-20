package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.CustomerLogin;

public interface CustomerLoginRepository extends CrudRepository<CustomerLogin, Integer>{

	public CustomerLogin findByEmail(String email);
}