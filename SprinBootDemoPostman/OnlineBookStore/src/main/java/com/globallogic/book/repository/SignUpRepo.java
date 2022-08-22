package com.globallogic.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.book.entity.SignUp;

public interface SignUpRepo extends JpaRepository<SignUp, Integer> {
	
	public boolean findByEmailAndPasswordAndType(String email,String password,String type);

}
