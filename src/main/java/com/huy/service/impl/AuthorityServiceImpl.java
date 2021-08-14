package com.huy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huy.dao.AccountDAO;
import com.huy.dao.AuthorityDAO;
import com.huy.entity.Account;
import com.huy.entity.Authority;
import com.huy.service.AuthorityService;

@Service
public class AuthorityServiceImpl implements AuthorityService{
	@Autowired
	AuthorityDAO dao;
	@Autowired
	AccountDAO acdao;
	

	public List<Authority> findAuthoritiesOfAdministrators() {
		List<Account> accounts = acdao.getAdministrators();
		return dao.authoritiesOf(accounts);
	}

	public List<Authority> findAll() {
		return dao.findAll();
	}

	
	public Authority create(Authority auth) {
		return dao.save(auth);
	}

	public void delete(Integer id) {
		dao.deleteById(id);
	}
	
	
}
