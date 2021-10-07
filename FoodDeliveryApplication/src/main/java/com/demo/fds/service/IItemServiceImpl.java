package com.demo.fds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.fds.dao.IItemDao;
import com.demo.fds.entities.Item;


@Service
public class IItemServiceImpl implements IItemService {
     @Autowired
     IItemDao itemDao;
	
	@Override
	public List<Item> getAllItems() {
		
		return itemDao.findAll();
	}

}
