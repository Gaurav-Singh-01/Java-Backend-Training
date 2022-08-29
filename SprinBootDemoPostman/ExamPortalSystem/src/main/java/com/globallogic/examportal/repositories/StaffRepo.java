package com.globallogic.examportal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.globallogic.examportal.entity.Staff;

@Repository
public interface StaffRepo extends JpaRepository<Staff, Long> {

}
