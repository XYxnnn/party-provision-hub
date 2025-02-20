package com.example.demo.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Product;

public interface ProductOrderPageRepostory extends JpaRepository<Product, Integer> {
	public List<Product> findByCategoryId(int c_id);
	public List<Product> findByCategoryIdOrderByPriceDesc(int c_id, Sort sort);
	public List<Product> findByCategoryIdOrderByRatingDesc(int c_id, Sort sort);
}
