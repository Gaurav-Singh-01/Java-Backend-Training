package com.globallogic.examportal.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.examportal.entity.Exam;
import com.globallogic.examportal.entity.Subject;
import com.globallogic.examportal.services.ExamService;
import com.globallogic.examportal.services.ResultService;
import com.globallogic.examportal.services.StudentService;
import com.globallogic.examportal.services.SubjectWiseMarksService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentService;

	@Autowired
	SubjectWiseMarksService subjectWiseMarksService;
	
	@Autowired
	ResultService resultService;
	
	@Autowired
	ExamService examService;

	// 6. As Student able to view all the subject
	@GetMapping("/viewSubject/{id}") // studentId
	public List<Subject> viewSubject(@PathVariable("id") long id) {
		return studentService.viewSubjects(id);
	}

	// 7. As Student able to view the exam
	@GetMapping("/viewExam/studentId/{id}") // studentId
	public List<Exam> viewExam(@PathVariable("id") long id) {
		return studentService.viewExam(id);
	}

	//9. After submitted the exam result will be publish subject wise
	// 10. Student will be able to see the result of each subject and percentage of each exam
	@GetMapping("/viewResult/studentId/{id}") // studentId
	public Map<String,Double> viewResultSubjectWise(@PathVariable("id") long id) {
		return subjectWiseMarksService.getSubjectWiseResult(id);
	}
	
	//8. As Student able to attempt the exam 
	@GetMapping("/attemptExam/examId/{id}")
	public String attemptExam(@PathVariable long id) {
		return examService.attemptExam(id);
	}
	

}
