package com.globallogic.examportal.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.globallogic.examportal.entity.Staff;

@Service
public interface StaffService {
	
	    //GET
		public List<Staff> showDetails();
		
		//POST
		public List<Staff> addStaffEntity(Staff staff);
		
		//PUT
		public List<Staff> updateStaffEntity(Staff staff);
		
		//DELETE
		public String delete(long id);

}
