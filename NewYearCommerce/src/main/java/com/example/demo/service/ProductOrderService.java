package com.example.demo.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.example.demo.entity.Product;

public interface ProductOrderService {
	Product getProductById(int id);
	List<Product> getAllProductByCategoryId(int c_id);
	List<Product> getProductsOrderedByPrice(int c_id);
	List<Product> getProductsOrderedByRate(int c_id);
}
