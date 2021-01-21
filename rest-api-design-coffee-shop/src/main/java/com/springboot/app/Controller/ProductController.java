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

import com.springboot.app.Model.Products;
import com.springboot.app.Service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
    ProductService productService;

    @GetMapping("/view")
    public List<Products> list() {
        return productService.listAllUser();
    }
    
   
   @GetMapping("/search/{item_id}")
    public ResponseEntity<Products> get(@PathVariable String item_id) {
        try {
            Products product = productService.get(item_id);
            return new ResponseEntity<Products>(product, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Products>(HttpStatus.NOT_FOUND);
        }      
    }
  
    
    
    
    

}
