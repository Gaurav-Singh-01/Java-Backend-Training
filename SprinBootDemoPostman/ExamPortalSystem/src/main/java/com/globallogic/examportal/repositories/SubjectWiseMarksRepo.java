package com.globallogic.examportal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.globallogic.examportal.entity.SubjectWiseMarks;

@Repository
public interface SubjectWiseMarksRepo extends JpaRepository<SubjectWiseMarks, Long>{

}
