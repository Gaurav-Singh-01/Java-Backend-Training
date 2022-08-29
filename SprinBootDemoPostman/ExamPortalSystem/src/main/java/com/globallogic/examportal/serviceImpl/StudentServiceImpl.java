package com.globallogic.examportal.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globallogic.examportal.entity.Course;
import com.globallogic.examportal.entity.Exam;
import com.globallogic.examportal.entity.Student;
import com.globallogic.examportal.entity.Subject;
import com.globallogic.examportal.entity.Student;
import com.globallogic.examportal.repositories.CourseRepo;
import com.globallogic.examportal.repositories.ExamRepo;
import com.globallogic.examportal.repositories.StudentRepo;
import com.globallogic.examportal.services.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepo studentRepo;

	@Autowired
	CourseRepo courseRepo;

	@Autowired
	ExamRepo examRepo;

	@Override
	public List<Student> showDetails() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	@Override
	public List<Student> addStudent(Student student) {

		Course course = courseRepo.findById(student.getCourse().getId()).get();
		student.setCourse(course);
		studentRepo.save(student);
		return studentRepo.findAll();
	}

	@Override
	public List<Student> updateStudent(Student student) {
		studentRepo.save(student);
		return studentRepo.findAll();
	}

	@Override
	public String delete(long id) {
		// TODO Auto-generated method stub
		studentRepo.deleteById(id);
		return "Student deleted successfully";
	}

	// view subjects
	@Override
	public List<Subject> viewSubjects(long id) // studentid
	{
		Student student = studentRepo.findById(id).get();
		return student.getCourse().getSubject();
	}

	// view exam
	@Override
	public List<Exam> viewExam(long id) // studentid
	{
		Student student = studentRepo.findById(id).get();
		String course = student.getCourse().getCourse();
		String branch = student.getCourse().getbranch();
		
		return examRepo.findByCourseAndBranch(course, branch);
	}

//	//admin and staff view student list
	@Override
	public List<String> showStudentList() {
		
		return studentRepo.findName();
	}

}
