package com.demo.fds.service;

import java.util.List;

import com.demo.fds.entities.OrderDetails;
import com.demo.fds.exception.OrderDetailsNotFoundException;

public interface IOrderDetailsService {
	public OrderDetails addOrder(OrderDetails order);
	public OrderDetails updateOrder(int orderId,OrderDetails order);
	public OrderDetails deleteOrderById(int orderId) throws OrderDetailsNotFoundException ;
	public OrderDetails removeOrder(int orderId);
	public OrderDetails viewAllOrders(int customerId,int cartId);
	//public OrderDetails viewAllOrders(int customerId);
	public List<OrderDetails> viewOrder();

}
