package com.huy.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.huy.entity.Product;

public interface ProductService {

	List<Product> fillAll();

	Product findById(Integer id);

	List<Product> findByCategoryId(String cid);

	Page<Product> findAllBy(Pageable pageable);

	List<Product> findAll();

	Product create(Product product);

	Product update(Product product);

	void delete(Integer id);


	

}
