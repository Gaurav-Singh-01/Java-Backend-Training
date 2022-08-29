package com.globallogic.examportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.examportal.entity.Exam;
import com.globallogic.examportal.entity.Student;
import com.globallogic.examportal.entity.SubjectWiseMarks;
import com.globallogic.examportal.services.ExamService;
import com.globallogic.examportal.services.StudentService;
import com.globallogic.examportal.services.SubjectWiseMarksService;

@RestController
@RequestMapping("/staff")
public class StaffController {

	@Autowired
	StudentService studentService;

	@Autowired
	ExamService examService;
	
	@Autowired
	SubjectWiseMarksService subjectWiseMarksService;

	// 2. As Satff and admin able to add the admission of student
	@PostMapping("/addStudent")
	public List<Student> addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
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

}
