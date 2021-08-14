package com.huy.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huy.entity.OrderDetail;

public interface OrderDetailDAO extends JpaRepository<OrderDetail, Long>{

}
