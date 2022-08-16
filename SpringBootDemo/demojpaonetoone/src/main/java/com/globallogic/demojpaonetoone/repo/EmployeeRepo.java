package com.globallogic.demojpaonetoone.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.demojpaonetoone.entity.EmployeeEntity;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Integer>{

}
