package com.globallogic.book.entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column
	String name;
	
	@Column
	String address;
	
	@Column
	long phoneNo;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	SignUp signup;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String name, String address, long phoneNo, SignUp signup) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phoneNo = phoneNo;
		this.signup = signup;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public SignUp getSignup() {
		return signup;
	}

	public void setSignup(SignUp signup) {
		this.signup = signup;
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + address + ", phoneNo=" + phoneNo + ", signup="
				+ signup + "]";
	}
	
	
	
	
	
	

}
