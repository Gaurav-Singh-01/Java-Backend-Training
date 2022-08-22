package com.globallogic.book.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.globallogic.book.entity.Admin;

@Component
public interface AdminService {
	
	//GET-->LOGIN success
	public String login(Admin admin);
	
	//GET-->
	public List<Admin> details();
	
	//POST admin details
	public List<Admin> addAdmin(Admin admin);
	
	//PUT
	public String updateAdmin(Admin admin);
	
	//DELETE
	public String delete(int id);

}
