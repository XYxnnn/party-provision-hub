package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Category;
import com.example.demo.entity.Product;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.InventoryManageRepository;
import com.example.demo.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	private CategoryRepository categoryRepository;
	
	public CategoryServiceImpl(CategoryRepository categoryRepository) {
		super();
		this.categoryRepository = categoryRepository;
	}

	@Override
	public Category getCategoryById(int cat_id) {
		// TODO Auto-generated method stub
		return this.categoryRepository.findById(cat_id).get();
	}
	
	@Override
	public Category saveCategory(Category category) {
		return categoryRepository.save(category);
	}
	
	@Override
	public Category updateCategory(Category category) {
		return categoryRepository.save(category);
	}
	
	@Override
	public void deleteCategoryById(int id) {
		categoryRepository.deleteById(id);
	}
}
