package com.springboot.app.Controller;

import java.util.List;
import java.util.NoSuchElementException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.springboot.app.Model.Customers;
import com.springboot.app.Service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	@Autowired
    CustomerService customerService;

    @GetMapping("/all")
    public List<Customers> list() {
        return customerService.listAllUser();
    }
    
   
    @GetMapping("/search/{ctr_id}")
    public ResponseEntity<Customers> get(@PathVariable int ctr_id) {
        try {
            Customers customer = customerService.get(ctr_id);
            return new ResponseEntity<Customers>(customer, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Customers>(HttpStatus.NOT_FOUND);
        }      
    }
}
