package com.springboot.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.Model.Products;
import com.springboot.app.Repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Products> listAllUser() {
        return productRepository.findAll();
    }
	
	
	public Products get(String item_id) {
        return productRepository.findById(item_id).get();
    }
	
	     
	
	
	

}
