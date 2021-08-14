package com.huy.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huy.entity.Category;
import com.huy.entity.Product;
import com.huy.service.CategoryService;
import com.huy.service.ProductService;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/categories")
public class CategoriyRestController {
	@Autowired
	CategoryService categoriyService;

	
	@GetMapping()
	public List<Category> getAll() {
		return categoriyService.findAll();
	}
}
