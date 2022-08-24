package com.globallogic.department.controller;


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

import com.globallogic.department.entity.DepartmentEntity;
import com.globallogic.department.services.DepartmentEntityService;


@RestController
@RequestMapping("/departmentEntity")
public class DepartmentEntityController {

	@Autowired
	DepartmentEntityService service;

	@GetMapping("/")
	public List<DepartmentEntity> showEmployees() {
		return service.showEmployees();
	}

	@PostMapping("/")
	public List<DepartmentEntity> addEmployees(@RequestBody DepartmentEntity dept) {
		return service.addEmployees(dept);
	}

	@PutMapping("/")
	public List<DepartmentEntity> updateEmployees(@RequestBody DepartmentEntity dept) {

		return service.updateEmployees(dept);
	}

	@DeleteMapping("/{id}")
	public List<DepartmentEntity> deleteEmployees(@PathVariable("id") long id) {
		return service.deleteEmployees(id);
	}

}

