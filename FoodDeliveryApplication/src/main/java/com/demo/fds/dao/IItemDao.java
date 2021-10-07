package com.demo.fds.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.fds.entities.Item;

@Repository
public interface IItemDao extends JpaRepository<Item, String> {

}
