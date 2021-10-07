package com.demo.fds.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.fds.entities.Customer;

public interface ICustomerDao extends JpaRepository<Customer, Integer> {

}
