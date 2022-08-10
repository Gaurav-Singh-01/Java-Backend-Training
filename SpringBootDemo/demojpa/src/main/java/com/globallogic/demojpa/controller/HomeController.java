package com.globallogic.demojpa.controller;

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

import com.globallogic.demojpa.entity.EmployeeEntity;
import com.globallogic.demojpa.repo.EmployeeRepo;

@RestController
@RequestMapping("/home")
public class HomeController {

	@Autowired
	EmployeeRepo repo;

	// use the GET All the data
	@GetMapping("/")
	public List<EmployeeEntity> showEmployee() {

		// return all the values from the table
		return repo.findAll();

	}

	// POST request
	// each time it will create a new data request
	// will send the data with body
	@PostMapping("/")
	public EmployeeEntity addEmployee(@RequestBody EmployeeEntity e) {

		System.err.println("Data added successfully");
		repo.save(e);
		return e;

	}

	@PutMapping("/")
	public EmployeeEntity updateEmployee(@RequestBody EmployeeEntity e) {

		System.err.println("Data updated successfully");
		repo.save(e);
		return e;
	}

	// delete : it is used to delete the resource on the server
	@DeleteMapping("/{id}")
	public String deleteEmployee(@PathVariable("id") int id) {

		System.err.println("Deleted id is "+id);
		repo.deleteById(id);

		return "Data Deleted Successfully";
	}

}
