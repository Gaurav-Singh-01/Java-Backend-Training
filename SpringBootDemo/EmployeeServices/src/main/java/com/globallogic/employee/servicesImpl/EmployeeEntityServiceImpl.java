package com.globallogic.employee.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globallogic.employee.entity.EmployeeEntity;
import com.globallogic.employee.repositories.EmployeeEntityRepo;
import com.globallogic.employee.services.EmployeeEntityService;

@Service
public class EmployeeEntityServiceImpl implements EmployeeEntityService {
	
	@Autowired
	EmployeeEntityRepo repo;

	@Override
	public List<EmployeeEntity> showEmployees() {
		return repo.findAll();
	}

	@Override
	public List<EmployeeEntity> addEmployees(EmployeeEntity emp) {

		repo.save(emp);
		return repo.findAll();
	}

	@Override
	public List<EmployeeEntity> updateEmployees(EmployeeEntity emp) {
		repo.save(emp);
		return repo.findAll();
	}

	@Override
	public List<EmployeeEntity> deleteEmployees(long id) {
		repo.deleteById(id);
		return repo.findAll();
	}

}
