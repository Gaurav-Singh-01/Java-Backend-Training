package com.globallogic.allmappings.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.allmappings.entity.Register;

public interface RegisterRepo extends JpaRepository<Register, Long> {

}
