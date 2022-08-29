package com.globallogic.examportal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.globallogic.examportal.entity.Subject;

@Repository
public interface SubjectRepo extends JpaRepository<Subject, Long> {

}
