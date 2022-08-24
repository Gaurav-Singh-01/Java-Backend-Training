package com.globallogic.employee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.globallogic.employee.entity.EmployeeEntity;

@Repository
public interface EmployeeEntityRepo extends JpaRepository<EmployeeEntity, Long> {

}
