package com.globallogic.jpagenerationtype.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.globallogic.jpagenerationtype.entity.EmployeeDemo;

@Component
public interface EmployeeService {

	public String addEmployee(EmployeeDemo emp);
	
	public List<EmployeeDemo> seeEmployee();
	
	public List<EmployeeDemo> findEmployeeByName(String name);

	

}
