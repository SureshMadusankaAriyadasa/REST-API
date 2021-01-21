package com.springboot.app.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.Model.Customers;
import com.springboot.app.Repository.CustomerRepository;


@Service
public class CustomerService {
	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customers> listAllUser() {
        return customerRepository.findAll();
    }
	
	
	public Customers get(int ctr_id) {
        return customerRepository.findById(ctr_id).get();
    }


	public Optional<Customers> findById(int ctr_id) {
		// TODO Auto-generated method stub
		return null;
	}
}
