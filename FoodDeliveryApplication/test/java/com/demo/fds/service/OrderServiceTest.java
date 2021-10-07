package com.demo.fds.service;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.fds.dao.IOrderDetailsDao;
import com.demo.fds.entities.FoodCart;
import com.demo.fds.entities.OrderDetails;


@SpringBootTest
public class OrderServiceTest {

		@Autowired
		IOrderDetailsService orderService;
		
		@Autowired
		IOrderDetailsDao orderDao;
		
		@Test
		@Disabled
		void testViewOrder() {	
		    List<OrderDetails> orders = orderService.viewOrder();
			assertEquals(113, orders.get(1).getOrderId());
			assertEquals(LocalDateTime.of(2020, 7, 9, 12, 33, 44,000000000), orders.get(1).getOrderDate());
			assertEquals("completed", orders.get(1).getOrderStatus());
			assertEquals(114, orders.get(2).getOrderId());
			assertEquals(LocalDateTime.of(2020, 7, 9, 12, 33, 44,000000000), orders.get(2).getOrderDate());
			assertEquals("pending", orders.get(2).getOrderStatus());
		   
		}
		
		@Test
		@Disabled
		void testAddOrder() {
		    FoodCart cart=new FoodCart();
		    OrderDetails order = new OrderDetails(207,LocalDateTime.of(2020, 3, 20, 12, 14, 15,188),"Completed",cart);
			OrderDetails newOrder= orderService.addOrder(order);
			assertEquals(207, newOrder.getOrderId());
			assertEquals(LocalDateTime.of(2020, 3, 20, 12, 14, 15,188), newOrder.getOrderDate());
			assertEquals("Completed", newOrder.getOrderStatus());
		}
		
		@Test 
		@Disabled
		void testRemoveOrderById() {
	    OrderDetails order = orderService.removeOrder(207);
	      }
	
		

}

