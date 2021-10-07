package com.demo.fds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.fds.dao.IFoodCartDao;
import com.demo.fds.dao.IItemDao;
import com.demo.fds.entities.FoodCart;
import com.demo.fds.entities.Item;

@Service
public class FoodCartServiceImpl implements IFoodCartService {

	@Autowired
	IFoodCartDao cartDao;
	@Autowired
    IItemDao   itemDao;
	
	@Override
	public FoodCart addItemToCart(int cartId,String itemId) {
	 FoodCart cart= cartDao.findById(cartId).get();
	 Item item =itemDao.findById(itemId).get();
	 cart.getItems().add(item);
	 return cartDao.save(cart);
	}

	@Override
	public FoodCart increaseQuantity(int cartId,String itemId,int quantity)
	{
	FoodCart cart=cartDao.findById(cartId).get(); 
	Item item =itemDao.findById(itemId).get();
    item.setQuantity(quantity+1);
	return cartDao.save(cart);
	}

    @Override
	public FoodCart removeItem(int cartId, String itemId)
	{FoodCart cart=cartDao.findById(cartId).get();                      ;
	itemDao.deleteById(itemId);
	return cart;
	}

	@Override
	public FoodCart clearCart(int cartId)
	{
	FoodCart cart= cartDao.findById(cartId).get();
	cartDao.deleteById(cartId);
	return cart;
	}

    @Override
	public FoodCart reduceQuantity(int cartId, String itemId, int quantity) {
		FoodCart cart=cartDao.findById(cartId).get(); 
		Item item =itemDao.findById(itemId).get();
	    item.setQuantity(quantity-1);
		return cartDao.save(cart);
	}

	@Override
	public List<FoodCart> getAllItems() {
		return cartDao.findAll();
	}
}
