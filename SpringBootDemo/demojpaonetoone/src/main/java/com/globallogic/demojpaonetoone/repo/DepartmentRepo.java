package com.globallogic.demojpaonetoone.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.demojpaonetoone.entity.DepartmentEntity;

public interface DepartmentRepo extends JpaRepository<DepartmentEntity, Integer>{

}
