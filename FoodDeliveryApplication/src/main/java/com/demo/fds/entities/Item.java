package com.demo.fds.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {
    @Id
	private String itemId;
	private String itemName;
	//private Category category;
	private int quantity;
	private double cost;
	//private List<Restaurant> restaurants;
	
	//constructors
	public Item() {}
	public Item(String itemId, String itemName, int quantity, double cost) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		//this.category = category;
		this.quantity = quantity;
		this.cost = cost;
		//this.restaurants = restaurants;	
	}
	
	//getter & setter
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	//public Category getCategory() {
	//	return category;
	//}
//	public void setCategory(Category category) {
	//	this.category = category;
//	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	//public List<Restaurant> getRestaurants() {
	//	return restaurants;
	//}
	//public void setRestaurants(List<Restaurant> restaurants) {
	//	this.restaurants = restaurants;
//	}

	//to string
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ",  quantity=" + quantity
				+ ", cost=" + cost + "]";
	}

	
}
