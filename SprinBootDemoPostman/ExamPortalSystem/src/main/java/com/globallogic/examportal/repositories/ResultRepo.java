package com.globallogic.examportal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.globallogic.examportal.entity.Result;

@Repository
public interface ResultRepo extends JpaRepository<Result, Long> {

}
