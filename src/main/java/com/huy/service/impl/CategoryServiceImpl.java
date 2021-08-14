package com.huy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huy.dao.CategoryDAO;
import com.huy.entity.Category;
import com.huy.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{
	@Autowired
	CategoryDAO cdao;
	
	@Override
	public List<Category> findAll() {
		return cdao.findAll();
	}

}
