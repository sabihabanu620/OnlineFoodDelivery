
package com.demo.fds.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;


@Entity
public class FoodCart {
	@Id
	@GeneratedValue
	private int cartId;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name= "Cus_Cart")
    private Customer customer;
	
	
	@OneToMany(targetEntity=Item.class, cascade=CascadeType.ALL)
	@JoinColumn(name="Cart_Item", referencedColumnName = "cartId")
	private List<Item> Items= new ArrayList<>();
	
	//constructors
	public FoodCart() {}
     public FoodCart(int cartId, Customer customer, List<Item> items) {
		super();
		this.cartId = cartId;
		this.customer = customer;
		Items = items;
	}
   //getters & setters
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<Item> getItems() {
		return Items;
	}
	public void setItems(List<Item> items) {
		Items = items;
	}
     //to string
	@Override
	public String toString() {
		return "FoodCart [cartId=" + cartId + ", customer=" + customer + ", Items=" + Items + "]";
	}
	
	
	
 }

