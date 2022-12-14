package com.assignments.Ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignments.Ecommerce.entity.Customer;
import com.assignments.Ecommerce.entity.Merchant;
import com.assignments.Ecommerce.entity.Product;
import com.assignments.Ecommerce.repository.CustomerRepo;
import com.assignments.Ecommerce.repository.MerchantRepo;
import com.assignments.Ecommerce.repository.ProductRepo;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	ProductRepo prodRepo;

	@Autowired
	CustomerRepo repo;
	
	@GetMapping("/")
	public List<Customer> showDetails(){
		
		return repo.findAll();			
	}
	
//  10- As super Admin able to add the customer and should be able to buy the product  
	@PostMapping("/")
	public List<Customer> addDetails(@RequestBody Customer cus){
		
		Product prod = prodRepo.findById(cus.getProduct().getId()).get();
		cus.setProduct(prod);
		repo.save(cus);
		return repo.findAll();
	}
	
	@PutMapping("/")
	public List<Customer> updateDetails(@RequestBody Customer cus){
		
		repo.save(cus);
		return repo.findAll();
	}
	

	
	@DeleteMapping("/{id}")
	public List<Customer> deleteDetails(@PathVariable("id") int id){
		
		repo.deleteById(id);
		return repo.findAll();
	}
	
	
}