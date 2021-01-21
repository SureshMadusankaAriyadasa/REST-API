package com.springboot.app.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.Model.Orders;
import com.springboot.app.Repository.OrderRepository;

@Service
public class OrderService {
	
	
	@Autowired
	private OrderRepository orderRepository;
	
	public Orders save(Orders orders) {
        return orderRepository.save(orders);
    }
	
	public Orders get(int id) {
        return orderRepository.findById(id).get();
    }
	public void delete(int id) {
        orderRepository.deleteById(id);
	}

	public List<Orders> listAllUser() {
        return orderRepository.findAll();
    }
	
	private List<Orders> order=new ArrayList<>(Arrays.asList(
			new Orders("3","suresh","ariyadasa","no 716, 4th lane, church road, Hingurakgoda.","+94769661212","a001","2","1500","1"),
			new Orders("4","suresh","ariyadasa","no 716, 4th lane, church road, Hingurakgoda.","+94769661212","a001","1","750","1") ));
	
	public void addOrders(Orders orders) {
		order.add(orders);
	}
	
}
