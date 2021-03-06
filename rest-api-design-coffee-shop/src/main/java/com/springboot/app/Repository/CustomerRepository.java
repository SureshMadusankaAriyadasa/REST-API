package com.springboot.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot.app.Model.Customers;

@Repository
public interface CustomerRepository extends JpaRepository<Customers, Integer> {

}