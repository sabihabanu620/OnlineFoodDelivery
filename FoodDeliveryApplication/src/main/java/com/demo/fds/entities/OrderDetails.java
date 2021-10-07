package com.demo.fds.entities;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class OrderDetails {

	@Id
	private int orderId;
	private LocalDateTime orderDate;
	private String orderStatus;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name= "Cart_Order")
	private FoodCart cart;
	
	//constructors 
	public OrderDetails() {}

	public OrderDetails(int orderId, LocalDateTime orderDate, String orderStatus, FoodCart cart) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
		this.cart = cart;
	}
	//getter & setter

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public FoodCart getCart() {
		return cart;
	}

	public void setCart(FoodCart cart) {
		this.cart = cart;
	}

	//to string
	@Override
	public String toString() {
		return "OrderDetails [orderId=" + orderId + ", orderDate=" + orderDate + ", orderStatus=" + orderStatus
				+ ", cart=" + cart + "]";
	}	
	
}
