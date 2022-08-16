package com.assignments.Ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignments.Ecommerce.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
