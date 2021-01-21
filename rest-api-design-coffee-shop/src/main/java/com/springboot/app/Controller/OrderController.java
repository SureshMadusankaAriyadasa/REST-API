package com.springboot.app.Controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.Model.Orders;
import com.springboot.app.Service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	private OrderService orderService;

	
	 @GetMapping("/all_orders")
	    public List<Orders> list() {
	        return orderService.listAllUser();
	    }

	//add the order
	@PostMapping(path="/add",consumes = "application/json") 
	 public Orders save(@RequestBody Orders orders) {
		System.out.print("Ordes save work properly!");
		orderService.save(orders);
		return orders;	
	}

	
	@PutMapping("/update/{id}")
	public ResponseEntity<?> update(@RequestBody Orders order, @PathVariable Integer id) {
	    try {
	        Orders Product = orderService.get(id);
	        orderService.save(order);
	        return new ResponseEntity<>(HttpStatus.OK);
	    } catch (NoSuchElementException ep) {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }      
	}
	
	
	@DeleteMapping("/orders/{id}")
	public void delete(@PathVariable Integer id) {
	    orderService.delete(id);
	}
	


}
