package com.example.demo.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Category;
import com.example.demo.entity.Product;
import com.example.demo.service.CategoryService;
import com.example.demo.service.InventoryManageService;
import com.example.demo.service.ProductOrderService;


@Controller
public class InventoryManageController {
	
	private InventoryManageService imService;
	private ProductOrderService productOrderService;
	private CategoryService categoryService;
	
	public InventoryManageController(InventoryManageService imService) {
		super();
		this.imService = imService;

	}
	
	@GetMapping("/admin")
	public String listProducts(Model model) {
		model.addAttribute("product", imService.getAllProductsInCategory());
		return "inventory_management";
	}
	
	/*
	@GetMapping("/admin")
	public String listAllProductsById(@PathVariable(value="id") int id, Model model) {
		model.addAttribute("product", productOrderService.getAllProductByCategoryId(id));
		model.addAttribute("category", this.categoryService.getCategoryById(id));
		return "inventory_management";
	}
	*/
	
	@GetMapping("/admin/newcategory")
	public String addCategoryForm(Model model) {
		Category category = new Category();
		model.addAttribute("category", category);
		return "add_category";
	}
	
	@GetMapping("/admin/newproduct")
	public String addProductForm(Model model) {
		Product product = new Product();
		model.addAttribute("product", product);
		return "add_product";
	}
	
	@PostMapping("/admin")
	public String saveProduct(@ModelAttribute("product") Product product) {
		imService.saveProduct(product);
		return "redirect:/admin";
	}
	
	@GetMapping("/admin/edit/{id}")
	public String editProductForm(@PathVariable int id, Model model) {
		model.addAttribute("product", imService.getProductById(id));
		return "update_product";
	}
	
	@PostMapping("/admin/{id}")
	public String updateBook(@PathVariable int id, 
			@ModelAttribute("product") Product product,
			Model model) {
		Product existingProduct = imService.getProductById(id);
		existingProduct.setId(id);
		existingProduct.setName(product.getName());
		existingProduct.setPrice(product.getPrice());
		existingProduct.setInventory_amount(product.getInventory_amount());
		existingProduct.setCategory_id(product.getCategory_id());
		existingProduct.setRating(product.getRating());
		existingProduct.setImage(product.getImage());
		existingProduct.setDescription(product.getDescription());
		
		imService.updateProduct(existingProduct);
		return "redirect:/admin";
	}
	
	@GetMapping("/admin/{id}")
	public String deleteProduct(@PathVariable int id) {
		imService.deleteProductById(id);
		return "redirect:/admin";
	}
}
