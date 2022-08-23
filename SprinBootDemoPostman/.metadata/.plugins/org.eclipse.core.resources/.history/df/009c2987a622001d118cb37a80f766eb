package com.globallogic.book.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.globallogic.book.entity.User;
import com.globallogic.book.repository.UserRepo;
import com.globallogic.book.services.UserService;

@Component
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo repoUser;
	
	@Override
	public List<User> showDetails() {
		return repoUser.findAll();
	}

	@Override
	public List<User> addUser(User user) {
		repoUser.save(user);
		return repoUser.findAll();
	}

	@Override
	public String updateUser(User user) {
		// TODO Auto-generated method stub
		repoUser.save(user);
		return "User Updated Successfully";
	}

	@Override
	public String delete(int id) {
		// TODO Auto-generated method stub
		repoUser.deleteById(id);
		return "User deleted successfully";
	}

}
