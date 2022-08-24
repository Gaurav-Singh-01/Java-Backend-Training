package com.globallogic.department.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globallogic.department.entity.DepartmentEntity;
import com.globallogic.department.repositories.DepartmentEntityRepo;
import com.globallogic.department.services.DepartmentEntityService;
import com.globallogic.department.*;

@Service
public class DepartmentEntityServicesImpl implements DepartmentEntityService {

	@Autowired
	DepartmentEntityRepo repo;

	@Override
	public List<DepartmentEntity> showEmployees() {
		return repo.findAll();
	}

	@Override
	public List<DepartmentEntity> addEmployees(DepartmentEntity dept) {

		repo.save(dept);
		return repo.findAll();
	}

	@Override
	public List<DepartmentEntity> updateEmployees(DepartmentEntity dept) {
		repo.save(dept);
		return repo.findAll();
	}

	@Override
	public List<DepartmentEntity> deleteEmployees(long id) {
		repo.deleteById(id);
		return repo.findAll();
	}


}
