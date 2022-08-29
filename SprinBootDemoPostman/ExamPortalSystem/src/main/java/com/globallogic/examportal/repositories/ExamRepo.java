package com.globallogic.examportal.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.globallogic.examportal.entity.Exam;

@Repository
public interface ExamRepo extends JpaRepository<Exam, Long> {

	public List<Exam> findByCourseAndBranch(String course, String branch);

	@Modifying
	@Transactional
	@Query("update Exam e set e.status = :status where e.id = :id")
	public void setStatusForExam(String status, long id);

}
