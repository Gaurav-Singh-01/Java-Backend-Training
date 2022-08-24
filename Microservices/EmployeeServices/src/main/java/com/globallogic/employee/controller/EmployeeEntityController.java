package com.globallogic.employee.controller;

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

import com.globallogic.employee.entity.EmployeeEntity;
import com.globallogic.employee.services.EmployeeEntityService;

@RestController
@RequestMapping("/employeeEntity")
public class EmployeeEntityController {

	@Autowired
	EmployeeEntityService service;

	@GetMapping("/")
	public List<EmployeeEntity> showEmployees() {
		return service.showEmployees();
	}

	@PostMapping("/")
	public List<EmployeeEntity> addEmployees(@RequestBody EmployeeEntity emp) {
		return service.addEmployees(emp);
	}

	@PutMapping("/")
	public List<EmployeeEntity> updateEmployees(@RequestBody EmployeeEntity emp) {

		return service.updateEmployees(emp);
	}

	@DeleteMapping("/{id}")
	public List<EmployeeEntity> deleteEmployees(@PathVariable("id") long id) {
		return service.deleteEmployees(id);
	}

}
