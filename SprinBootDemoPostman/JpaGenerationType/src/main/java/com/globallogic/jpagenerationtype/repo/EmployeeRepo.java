package com.globallogic.jpagenerationtype.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.jpagenerationtype.entity.EmployeeEntity;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Long> {

}
