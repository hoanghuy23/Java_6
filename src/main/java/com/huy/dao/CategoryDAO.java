package com.huy.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huy.entity.Category;

public interface CategoryDAO extends JpaRepository<Category, String>{

}
