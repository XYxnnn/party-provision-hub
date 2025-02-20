package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repository.InventoryManageRepository;
import com.example.demo.service.InventoryManageService;

@Service
public class InventoryManageServiceImpl implements InventoryManageService{
	
	private InventoryManageRepository productRepo;
	
	public InventoryManageServiceImpl(InventoryManageRepository productrepo) {
		super();
		this.productRepo = productrepo;
	}
	
	@Override
	public List<Product> getAllProductsInCategory() {
		return productRepo.findAll();
	}
	
	@Override
	public Product saveProduct(Product product) {
		return productRepo.save(product);
	}
	
	@Override
	public Product getProductById(int id) {
		return productRepo.findById(id).get();
	}
	
	@Override
	public Product updateProduct(Product product) {
		return productRepo.save(product);
	}
	
	@Override
	public void deleteProductById(int id) {
		productRepo.deleteById(id);
	}
}
