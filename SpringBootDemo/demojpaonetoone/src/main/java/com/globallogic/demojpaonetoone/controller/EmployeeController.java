package com.globallogic.demojpaonetoone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.demojpaonetoone.entity.DepartmentEntity;
import com.globallogic.demojpaonetoone.entity.EmployeeEntity;
import com.globallogic.demojpaonetoone.model.EmployeeModel;
import com.globallogic.demojpaonetoone.repo.DepartmentRepo;
import com.globallogic.demojpaonetoone.repo.EmployeeRepo;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeRepo repo;

	@Autowired
	DepartmentRepo repos;

	// use the GET All the data
	@GetMapping("/")
	public List<EmployeeEntity> showEmployee() {

		// return all the values from the table
		return repo.findAll();

	}

	@GetMapping("/demo")
	public ResponseEntity<EmployeeModel> requestDemo() {

		// return new ResponseEntity<String>("Hello World",HttpStatus.OK);
		// return new ResponseEntity<String>("Hello World",HttpStatus.BAD_REQUEST);
		// return new ResponseEntity<String>("Hello World",HttpStatus.NOT_FOUND);

		// Integer res=10;
		/*
		 * List<String> ls=new ArrayList<String>(); ls.add("Ravinder"); ls.add("kumar");
		 * ls.add("priya");
		 */
		EmployeeModel emp = new EmployeeModel(1001, "Ravinder", "Trainer");

		return new ResponseEntity<EmployeeModel>(emp, HttpStatus.OK);

	}

	// POST request
	// each time it will create a new data request
	// will send the data with body
	@PostMapping("/")
	public EmployeeEntity addEmployee(@RequestBody EmployeeEntity e) {

		System.out.println("dept  " + e.getDept());

		DepartmentEntity entity = repos.findById(e.getDept().getId()).get(); // changes from from line 45 to 52 in 2nd
																				// way

		System.err.println("dept id" + entity);

		e.setDept(entity);
		System.err.println(e);
		repo.save(e);
		System.err.println(e);
		System.err.println("Data added successfully");
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

		System.err.println("Deleted id is " + id);
		repo.deleteById(id);

		return "Data Deleted Successfully";
	}

}
