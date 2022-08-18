package com.globallogic.jpagenerationtype.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.globallogic.jpagenerationtype.entity.EmployeeDemo;
import com.globallogic.jpagenerationtype.repo.EmployeeDemoRepo;
import com.globallogic.jpagenerationtype.service.EmployeeService;

@Component
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeDemoRepo repo;

	@Override
	public String addEmployee(EmployeeDemo emp) {
		
		repo.save(emp);
		return "Data Added Successfully";
	}

	@Override
	public List<EmployeeDemo> seeEmployee() {
		return repo.findAll();
	}

	@Override
	public List<EmployeeDemo> findEmployeeByName(String name) {
		return repo.findBySname(name);
	}

}
