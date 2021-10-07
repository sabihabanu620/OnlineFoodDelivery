package com.demo.fds.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.fds.entities.FoodCart;

@Repository
public interface IFoodCartDao extends JpaRepository<FoodCart, Integer> {

}
