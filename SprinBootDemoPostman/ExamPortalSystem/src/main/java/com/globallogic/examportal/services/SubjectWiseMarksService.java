package com.globallogic.examportal.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.globallogic.examportal.entity.SubjectWiseMarks;

@Service
public interface SubjectWiseMarksService {

	// GET
	public List<SubjectWiseMarks> showDetails();

	// POST
	public List<SubjectWiseMarks> addSubjectWiseMarks(SubjectWiseMarks subjectWiseMarks);

	// PUT
	public List<SubjectWiseMarks> updateSubjectWiseMarks(SubjectWiseMarks subjectWiseMarks);

	// DELETE
	public String delete(long id);

}
