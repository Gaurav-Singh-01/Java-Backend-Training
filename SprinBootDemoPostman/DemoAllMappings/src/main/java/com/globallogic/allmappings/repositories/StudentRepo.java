package com.globallogic.allmappings.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.allmappings.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long>{

}
