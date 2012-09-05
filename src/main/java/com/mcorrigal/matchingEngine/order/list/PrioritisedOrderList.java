package com.mcorrigal.matchingEngine.order.list;

import java.util.Collections;

import com.mcorrigal.matchingEngine.order.interfaces.Order;
import com.mcorrigal.matchingEngine.order.interfaces.OrderList;
import com.mcorrigal.matchingEngine.orderBook.interfaces.OrderComparator;

public class PrioritisedOrderList extends SimpleOrderList implements OrderList {
	
	private OrderComparator orderComparator;
	
	public PrioritisedOrderList(OrderComparator orderComparator) {
		this.orderComparator = orderComparator;
	}
	
	@Override
	public void add(Order order) {
		orders.add(order);
		prioritiseOrders();
	}
	
	private void prioritiseOrders() {
		Collections.sort(orders, orderComparator);
	}
	
}
