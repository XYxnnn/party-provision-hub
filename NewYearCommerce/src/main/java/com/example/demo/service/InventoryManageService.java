package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Product;

public interface InventoryManageService {
	
	List<Product> getAllProductsInCategory();
	
	Product saveProduct(Product product);
	
	Product getProductById(int id);
	
	Product updateProduct(Product product);
	
	void deleteProductById(int id);
}
