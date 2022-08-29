package com.globallogic.examportal.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.globallogic.examportal.entity.Course;

@Service
public interface CourseService {

	// GET
	public List<Course> showDetails();

	// POST
	public List<Course> addCourse(Course course);

	// PUT
	public List<Course> updateCourse(Course course);

	// DELETE
	public String delete(long id);

}
