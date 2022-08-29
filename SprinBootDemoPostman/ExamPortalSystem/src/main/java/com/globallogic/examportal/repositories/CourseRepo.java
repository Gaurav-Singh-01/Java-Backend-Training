package com.globallogic.examportal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.globallogic.examportal.entity.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, Long> {
	
	//@Query("Select Course.subject from Course where ")

}
