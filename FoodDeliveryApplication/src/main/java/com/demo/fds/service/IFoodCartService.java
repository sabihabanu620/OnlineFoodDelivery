package com.demo.fds.service;

import java.util.List;

import com.demo.fds.entities.FoodCart;

public interface IFoodCartService 
    {
	public FoodCart addItemToCart(int cartId,String itemId);
	public FoodCart reduceQuantity(int cartId,String itemId,int quantity);
    public FoodCart removeItem(int cartId, String itemId);
	public FoodCart clearCart(int cartId);
	public FoodCart increaseQuantity(int cartId, String itemId, int quantity);
    public List<FoodCart> getAllItems();
    }
