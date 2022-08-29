package com.globallogic.examportal.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globallogic.examportal.entity.Course;
import com.globallogic.examportal.entity.Exam;
import com.globallogic.examportal.entity.Exam;
import com.globallogic.examportal.repositories.CourseRepo;
import com.globallogic.examportal.repositories.ExamRepo;
import com.globallogic.examportal.services.ExamService;

@Service
public class ExamServiceImpl implements ExamService {

	@Autowired
	ExamRepo examRepo;
	
	@Autowired
	CourseRepo courseRepo;

	@Override
	public List<Exam> showDetails() {
		// TODO Auto-generated method stub
		return examRepo.findAll();
	}

	@Override
	public List<Exam> addExam(Exam exam) {
		examRepo.save(exam);
		return examRepo.findAll();
	}

	@Override
	public List<Exam> updateExam(Exam exam) {
		examRepo.save(exam);
		return examRepo.findAll();
	}

	@Override
	public String delete(long id) {
		// TODO Auto-generated method stub
		examRepo.deleteById(id);
		return "Exam deleted successfully";
	}

}
