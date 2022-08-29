package com.globallogic.examportal.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globallogic.examportal.entity.Staff;
import com.globallogic.examportal.repositories.StaffRepo;
import com.globallogic.examportal.services.StaffService;

@Service
public class StaffSeviceImpl implements StaffService {

	@Autowired
	StaffRepo staffRepo;

	@Override
	public List<Staff> showDetails() {
		return staffRepo.findAll();
	}

	@Override
	public String delete(long id) {
		staffRepo.deleteById(id);
		return "DATA DELETED SUCCESSFULLY";
	}

	@Override
	public List<Staff> addStaffEntity(Staff staff) {
		staffRepo.save(staff);
		return staffRepo.findAll();
	}

	@Override
	public List<Staff> updateStaffEntity(Staff staff) {
		staffRepo.save(staff);
		return staffRepo.findAll();
	}

}
