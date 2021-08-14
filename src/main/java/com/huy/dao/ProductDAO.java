package com.huy.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.huy.entity.Product;

public interface ProductDAO extends JpaRepository<Product, Integer>{


	@Query("SELECT p FROM Product p WHERE p.category.id=?1")
	List<Product> indByCategoryId(String cid);
	
	Page<Product> findAllBy(Pageable pageable);

}
