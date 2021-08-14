package com.huy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.huy.dao.ProductDAO;
import com.huy.entity.Product;
import com.huy.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductDAO pdao;

	@Override
	public List<Product> fillAll() {
		return pdao.findAll();
	}

	@Override
	public Product findById(Integer id) {
		return pdao.findById(id).get();
	}

	@Override
	public List<Product> findByCategoryId(String cid) {
		// TODO Auto-generated method stub
		return pdao.indByCategoryId(cid);
	}

	@Override
	public Page<Product> findAllBy(Pageable pageable) {
		// TODO Auto-generated method stub
		return pdao.findAllBy(pageable);
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return pdao.findAll();
	}

	@Override
	public Product create(Product product) {
		// TODO Auto-generated method stub
		return pdao.save(product);
	}

	@Override
	public Product update(Product product) {
		// TODO Auto-generated method stub
		return pdao.save(product);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		pdao.deleteById(id);
	}

}
