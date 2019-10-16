package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.OrderList;

public class OrderService {

		private Map<String, OrderList> orderlistMap;
		private static final OrderService instance = new OrderService();
			
			public OrderService() {
			
			orderlistMap = new HashMap<String, OrderList>();
			
}
			public static OrderService getInstance() {
				return instance;
			}
			
		public void addOrder(OrderList orderlist) {
			
			orderlistMap.put(orderlist.getItem(), orderlist);
		}

}