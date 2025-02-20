package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Admin;

public interface AdminLoginRepository extends CrudRepository<Admin, Integer>{
	
	public Admin findByEmail(String email);
}