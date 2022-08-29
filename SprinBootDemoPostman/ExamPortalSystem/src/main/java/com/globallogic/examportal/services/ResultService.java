package com.globallogic.examportal.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.globallogic.examportal.entity.Result;

@Service
public interface ResultService {
	
	// GET
	public List<Result> showDetails();

	// GET
	public List<Result> addResult(long id);

	// PUT
	public List<Result> updateResult(Result result);

	// DELETE
	public String delete(long id);
	
	//GET
//	public List<Result> showResult(long id);
	
	

}
