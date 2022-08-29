package com.globallogic.examportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.examportal.entity.Course;
import com.globallogic.examportal.entity.Exam;
import com.globallogic.examportal.entity.Result;
import com.globallogic.examportal.entity.Staff;
import com.globallogic.examportal.entity.Student;
import com.globallogic.examportal.entity.SubjectWiseMarks;
import com.globallogic.examportal.services.CourseService;
import com.globallogic.examportal.services.ExamService;
import com.globallogic.examportal.services.ResultService;
import com.globallogic.examportal.services.StaffService;
import com.globallogic.examportal.services.StudentService;
import com.globallogic.examportal.services.SubjectWiseMarksService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	StaffService staffService;

	@Autowired
	CourseService courseService;

	@Autowired
	ExamService examService;

	@Autowired
	StudentService studentService;

	@Autowired
	SubjectWiseMarksService subjectWiseMarksService;

	@Autowired
	ResultService resultService;

	// 1. As Admin able to create the Course , Subject and Stream
	@PostMapping("/addCourse")
	public List<Course> addCourse(@RequestBody Course course) {
		return courseService.addCourse(course);
	}

	// 2. As Satff and admin able to add the admission of student
	@PostMapping("/addStudent")
	public List<Student> addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}

	// 3 .As admin able to add the Satff
	@PostMapping("/addStaff")
	public List<Staff> addStaff(@RequestBody Staff staff) {
		return staffService.addStaffEntity(staff);
	}

	// 4. As Admin able to create a exam
	@PostMapping("/createExam")
	public List<Exam> addExam(@RequestBody Exam exam) {
		return examService.addExam(exam);
	}

	// 11. As Admin and Staff able to view the list of student by name
	@GetMapping("/viewStudentList") // studentId
	public List<String> viewStudentList() {
		return studentService.showStudentList();
	}

	// Add subjects of students
	@PostMapping("/addMarks")
	public List<SubjectWiseMarks> addMarks(@RequestBody SubjectWiseMarks subjectWiseMarks) {
		return subjectWiseMarksService.addSubjectWiseMarks(subjectWiseMarks);
	}

	// Add result of students
	//12. As Admin and Staff mark the student as fail if overall is less than 50% 
	@GetMapping("/addResult/studentid/{id}")
	public List<Result> addResult(@PathVariable long id) {
		return resultService.addResult(id);
	}

//	@GetMapping("/showResult//studentId/{id}")
//	public List<Result> showResult(@PathVariable long id){
//		return ;
//		
//	}

}
