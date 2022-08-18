package com.globallogic.jpagenerationtype.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.jpagenerationtype.entity.EmployeeEntity;
import com.globallogic.jpagenerationtype.repo.EmployeeRepo;

@RestController
@RequestMapping("/employeejpa")
public class EmployeeController {

	@Autowired
	EmployeeRepo repo;

	@GetMapping("/")
	public List<EmployeeEntity> showEmployees() {

		return repo.findAll();
	}

	@PostMapping("/")
	public List<EmployeeEntity> addEmployees(@RequestBody EmployeeEntity e) {

		repo.save(e);
		return repo.findAll();
	}
}
