package com.globallogic.demojpaonetoone.controller;

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

import com.globallogic.demojpaonetoone.entity.DepartmentEntity;
import com.globallogic.demojpaonetoone.repo.DepartmentRepo;


@RestController
@RequestMapping("/department")
public class DepartmentController {
	
	@Autowired
	DepartmentRepo repo;
	
	
	@GetMapping("/")
	public List<DepartmentEntity> showDetails() {
		
		return repo.findAll();
	}

	@PostMapping("/")
	public List<DepartmentEntity> addEmployee(@RequestBody DepartmentEntity dept) {
		
		
		repo.save(dept);
		System.out.println("Data Added Successfully");
		return repo.findAll();
				
		
	}
	
	@PutMapping("/")
	public List<DepartmentEntity> updateEmployee(@RequestBody DepartmentEntity dept) {
		repo.save(dept);
		System.out.println("Data updated Successfully");
		return repo.findAll();
		
	}
	
	@DeleteMapping("/{id}")
	public List<DepartmentEntity> deleteEmployee(@PathVariable("id") int id) {
		
		System.err.println("Deleted id is "+id);
		repo.deleteById(id);
		return repo.findAll();
	}
	
	
	
	
}
