package com.demo.fds.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.fds.entities.OrderDetails;

@Repository
public interface IOrderDetailsDao extends JpaRepository<OrderDetails, Integer> {

}
