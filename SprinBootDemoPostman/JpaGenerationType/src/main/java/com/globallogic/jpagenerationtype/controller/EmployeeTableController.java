package com.globallogic.jpagenerationtype.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.jpagenerationtype.entity.EmployeeTable;
import com.globallogic.jpagenerationtype.repo.EmployeeTableRepo;

@RestController
@RequestMapping("/employeetable")
public class EmployeeTableController {

	@Autowired
	EmployeeTableRepo repo;

	@GetMapping("/")
	public List<EmployeeTable> showEmployees() {

		return repo.findAll();
	}

	@PostMapping("/")
	public List<EmployeeTable> addEmployees(@RequestBody EmployeeTable e) {

		repo.save(e);
		return repo.findAll();
	}
}
