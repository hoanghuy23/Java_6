package com.huy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huy.dao.AccountDAO;
import com.huy.entity.Account;
import com.huy.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{

	@Autowired
	AccountDAO dao;
	
	@Override
	public Account findById(String username) {
		return dao.findById(username).get();
	}

	@Override
	public List<Account> getAdministrators() {
		return dao.getAdministrators();
	}

	@Override
	public List<Account> findAll() {
		return dao.findAll();
	}

}
