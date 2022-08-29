package com.globallogic.examportal.entity;

import javax.persistence.*;

@Entity
@Table(name="student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	
	@Column
	String name;
	
	@Column
	long phoneNo;
	
	@Column
	String address;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	Course course;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	

	public Student(long id, String name, long phoneNo, String address, Course course) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNo = phoneNo;
		this.address = address;
		this.course = course;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phoneNo=" + phoneNo + ", address=" + address + ", course="
				+ course + "]";
	}

	
	
	
	
	
	
}