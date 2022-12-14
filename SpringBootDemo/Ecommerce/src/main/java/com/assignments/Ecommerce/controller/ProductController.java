package com.assignments.Ecommerce.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignments.Ecommerce.entity.Category;
import com.assignments.Ecommerce.entity.Merchant;
import com.assignments.Ecommerce.entity.Product;
import com.assignments.Ecommerce.repository.CategoryRepo;
import com.assignments.Ecommerce.repository.CustomerRepo;
import com.assignments.Ecommerce.repository.MerchantRepo;
import com.assignments.Ecommerce.repository.ProductRepo;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductRepo prodRepo;

	@Autowired
	CategoryRepo catRepo;

	@Autowired
	MerchantRepo merRepo;
	


//	1- As Super Admin should be able to add the product with name, id, color, price
//	2- As super Admin should be able to add the category of product
//	6- As super Admin should be able to add the merchant name to the product as name pin code , location, GST NO
	
	@PostMapping("/")
	public List<Product> addDetails(@RequestBody Product prod) {

		prodRepo.save(prod);
		return prodRepo.findAll();
	}

//  3- As Super Admin Able to View the product list
	@GetMapping("/")
	public List<Product> showDetails() {

		return prodRepo.findAll();
	}

//  4- As Super Admin should be able to view by category and their product
//	9- Make use of java 8 lambda and stream API for filter
//  give category id  --> returns list of product name	
	@GetMapping("/prodList/{id}")
	public List<String> showProductByCategoryId(@PathVariable("id") int id) {

		List<Product> prod = prodRepo.findAll();
		System.out.println(prod);

		List<Product> prodName = prod.stream().filter(e -> (e.getCategory().getId()) == id)
				.collect(Collectors.toList());

		System.out.println(prodName);
		List<String> name = new ArrayList<>();
		for (Product pro : prodName) {
			name.add(pro.getName());
		}
		return name;
	}

//  4- As Super Admin should be able to view by category and their product
//	9- Make use of java 8 lambda and stream API for filter
//  give category name  --> returns list of product name	
	@GetMapping("/prod/{name}")
	public List<String> showProductByCategoryName(@PathVariable("name") String cName) {

		List<Product> prod = prodRepo.findAll();
		System.out.println(prod);

		List<Product> prodName = prod.stream().filter(e -> (e.getCategory().getName()).equalsIgnoreCase(cName))
				.collect(Collectors.toList());

		System.out.println(prodName);
		List<String> name = new ArrayList<>();
		for (Product pro : prodName) {
			name.add(pro.getName());
		}
		return name;
	}

//  4- As Super Admin should be able to view by category and their product
//	9- Make use of java 8 lambda and stream API for filter
//  give category name  --> returns list of product with all attributes	
	@GetMapping("/fullprod/{name}")
	public List<Product> showFullProductByCategoryName(@PathVariable("name") String cName) {

		List<Product> prod = prodRepo.findAll();
		System.out.println(prod);

		List<Product> prodName = prod.stream().filter(e -> (e.getCategory().getName()).equalsIgnoreCase(cName))
				.collect(Collectors.toList());

		System.out.println(prodName);

		return prodName;
	}

//  5- As Super Admin should be able to search the product by name and category name
//	9- Make use of java 8 lambda and stream API for filter
//  give category name and product name  --> returns list of product with all attributes			
	@GetMapping("/search/{cName}/{pName}")
	public List<Product> searchProduct(@PathVariable("cName") String cName, @PathVariable("pName") String pName) {

		List<Product> prod = prodRepo.findAll();
		System.out.println(prod);

		List<Product> prodName = prod.stream().filter(
				e -> (e.getCategory().getName()).equalsIgnoreCase(cName) && (e.getName()).equalsIgnoreCase(pName))
				.collect(Collectors.toList());

		System.out.println(prodName);

		return prodName;

	}

//  7- As super Admin should be able to search the merchant by name and location
//	9- Make use of java 8 lambda and stream API for filter
//  give merchant name and location   --> returns list of merchant name		
	@GetMapping("/searchmerchant/{mName}/{mLocation}")
	public List<String> searchMerchant(@PathVariable("mName") String mName,
			@PathVariable("mLocation") String mLocation) {

		List<Product> prod = prodRepo.findAll();
		System.out.println(prod);

		List<Product> prodName = prod.stream().filter(e -> (e.getMerchant().getName()).equalsIgnoreCase(mName)
				&& (e.getMerchant().getLocation()).equalsIgnoreCase(mLocation)).collect(Collectors.toList());

		System.out.println(prodName);
		List<String> name = new ArrayList<>();
		for (Product pro : prodName) {
			name.add(pro.getMerchant().getName());
		}
		return name;

	}

	
	@PutMapping("/")
	public List<Product> updateDetails(@RequestBody Product prod) {
		prodRepo.save(prod);
		return prodRepo.findAll();
	}

	@DeleteMapping("/{id}")
	public List<Product> deleteDetails(@PathVariable("id") int id) {

		prodRepo.deleteById(id);
		return prodRepo.findAll();
	}

}
