package com.globallogic.allmappings.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.allmappings.entity.Teacher;

public interface TeacherRepo extends JpaRepository<Teacher, Long> {

}
