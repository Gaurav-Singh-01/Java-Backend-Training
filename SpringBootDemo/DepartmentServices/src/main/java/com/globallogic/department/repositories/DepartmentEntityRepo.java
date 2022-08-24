package com.globallogic.department.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.globallogic.department.entity.DepartmentEntity;

@Repository
public interface DepartmentEntityRepo extends JpaRepository<DepartmentEntity, Long> {

}
