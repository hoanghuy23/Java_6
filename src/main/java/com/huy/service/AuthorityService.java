package com.huy.service;

import java.util.List;

import com.huy.entity.Authority;

public interface AuthorityService {

	public List<Authority> findAuthoritiesOfAdministrators();

	public List<Authority> findAll();

	public Authority create(Authority auth);

	public void delete(Integer id);

}
