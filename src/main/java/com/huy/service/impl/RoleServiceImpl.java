package com.huy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huy.dao.RoleDAO;
import com.huy.entity.Role;
import com.huy.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{
	@Autowired
	RoleDAO dao;
	
	@Override
	public List<Role> findAll() {
		return dao.findAll();
	}

}
