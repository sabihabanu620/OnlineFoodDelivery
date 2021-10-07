package com.demo.fds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.fds.entities.FoodCart;
import com.demo.fds.entities.OrderDetails;
import com.demo.fds.service.IFoodCartService;

@CrossOrigin
@RestController
public class FoodCartController {
	
	@Autowired
    IFoodCartService cartService;
	
	//Adding items To Cart
	@PostMapping("/cart/{cartId}/item/{itemId}")
	ResponseEntity<FoodCart> addItemToCart(@PathVariable("cartId") int CartId , @PathVariable("itemId") String  ItemId)
	{
	 FoodCart crt=cartService.addItemToCart(CartId,ItemId);
	return new ResponseEntity<>(crt,HttpStatus.OK);
	}
	//deleting items from cart
	@DeleteMapping("/delete/{cartId}/item/{itemId}")
	ResponseEntity<FoodCart> removeItem(@PathVariable("cartId") int CartId , @PathVariable("itemId") String  ItemId)
	{
	 FoodCart crt=cartService.removeItem(CartId,ItemId);
	 return new ResponseEntity<>(crt,HttpStatus.OK);
	}
	//removing cart
	@DeleteMapping("/deletecart/{cartId}")
	ResponseEntity<FoodCart> clearCart(@PathVariable("cartId") int CartId)
	{
	 FoodCart crt=cartService.clearCart(CartId);
	 return new ResponseEntity<>(crt,HttpStatus.OK);
	}
	
	@PutMapping("/increase/{cartId}/item/{itemId}/{quantity}")
	ResponseEntity<FoodCart> increaseQuantity(@PathVariable("cartId") int cartId,@PathVariable("itemId") String itemId ,  @PathVariable("quantity") int quantity)
	{
	 FoodCart cart=cartService.increaseQuantity(cartId,itemId,quantity);
	 return new ResponseEntity<>(cart,HttpStatus.OK);
	}
	
	@PutMapping("/decrease/{cartId}/item/{itemId}/{quantity}")
	ResponseEntity<FoodCart> reduceQuantity(@PathVariable("cartId") int cartId,@PathVariable("itemId") String itemId ,  @PathVariable("quantity") int quantity)
	{
	 FoodCart cart=cartService.reduceQuantity(cartId,itemId,quantity);
	 return new ResponseEntity<>(cart,HttpStatus.OK);
	}
    
	@GetMapping("/cart")
	ResponseEntity <List<FoodCart>> getAllItems()
	   {
		  return new ResponseEntity<>(cartService.getAllItems(),HttpStatus.OK);
	  }
}
