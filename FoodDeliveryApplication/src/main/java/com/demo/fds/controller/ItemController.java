package com.demo.fds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.fds.entities.Item;
import com.demo.fds.service.IItemService;

@RestController
public class ItemController {
	
	@Autowired
     IItemService itemService;
	
	
    @GetMapping("/items")
	  ResponseEntity<List<Item>> getAllItems()
	   {
		  return new ResponseEntity<>(itemService.getAllItems(),HttpStatus.OK);
	  }

}
