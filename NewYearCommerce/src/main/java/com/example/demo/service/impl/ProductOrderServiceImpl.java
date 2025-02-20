package com.example.demo.service.impl;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductOrderPageRepostory;
import com.example.demo.service.ProductOrderService;

@Service
public class ProductOrderServiceImpl implements ProductOrderService {
	private ProductOrderPageRepostory page_order_repo;

	public ProductOrderServiceImpl(ProductOrderPageRepostory page_order_repo) {
		super();
		this.page_order_repo = page_order_repo;
	}
	
	@Override
	public List<Product> getAllProductByCategoryId(int c_id) {
		return this.page_order_repo.findByCategoryId(c_id);
	}

	@Override
	public Product getProductById(int p_id) {
		// TODO Auto-generated method stub
		return this.page_order_repo.findById(p_id).get();
	}

	@Override
	public List<Product> getProductsOrderedByPrice(int c_id) {
		// TODO Auto-generated method stub
		Sort sort = Sort.by(Sort.Direction.DESC, "price");
		return this.page_order_repo.findByCategoryIdOrderByPriceDesc(c_id, sort);
	}

	@Override
	public List<Product> getProductsOrderedByRate(int c_id) {
		// TODO Auto-generated method stub
		Sort sort = Sort.by(Sort.Direction.DESC, "rating");
		return this.page_order_repo.findByCategoryIdOrderByRatingDesc(c_id, sort);
	}

}
