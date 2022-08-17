package com.globallogic.allmappings.controller;

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

import com.globallogic.allmappings.entity.Teacher;
import com.globallogic.allmappings.repositories.TeacherRepo;


@RestController
@RequestMapping("/teacher")
public class TeacherController {
	
	@Autowired
	TeacherRepo repo;
	
	
	@GetMapping("/")
	public List<Teacher> showDetails() {
		
		return repo.findAll();
	}

	@PostMapping("/")
	public List<Teacher> addTeacher(@RequestBody Teacher tea) {
		
		repo.save(tea);
		System.out.println("Data Added Successfully");
		return repo.findAll();
				
		
	}
	
	@PutMapping("/")
	public List<Teacher> updatTeacher(@RequestBody Teacher tea) {
		repo.save(tea);
		System.out.println("Data updated Successfully");
		return repo.findAll();
		
	}
	
	@DeleteMapping("/{id}")
	public List<Teacher> deleteTeacher(@PathVariable("id") long id) {
		
		System.err.println("Deleted id is "+id);
		repo.deleteById(id);
		return repo.findAll();
	}
	
	
	
	
}
