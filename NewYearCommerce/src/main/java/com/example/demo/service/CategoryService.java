package com.example.demo.service;

import com.example.demo.entity.Category;
import com.example.demo.entity.Product;

public interface CategoryService {
	
	Category getCategoryById(int cat_id);
	
	Category saveCategory(Category category);
	
	Category updateCategory(Category category);
	
	void deleteCategoryById(int id);
}
