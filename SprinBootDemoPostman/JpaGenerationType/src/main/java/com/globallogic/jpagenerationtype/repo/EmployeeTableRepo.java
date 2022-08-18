package com.globallogic.jpagenerationtype.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.jpagenerationtype.entity.EmployeeTable;

public interface EmployeeTableRepo extends JpaRepository<EmployeeTable, Long> {

}
