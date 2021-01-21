package com.springboot.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.app.Model.Products;

@Repository
public interface ProductRepository extends JpaRepository<Products, String> {

}
