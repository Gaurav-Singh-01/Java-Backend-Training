package com.globallogic.examportal.entity;

import javax.persistence.*;

@Entity
@Table(name = "staff")
public class Staff {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	
	@Column
	String name;
	
	@Column
	String address;
	
	@Column
	long phoneNo;

	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Staff(long id, String name, String address, long phoneNo) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phoneNo = phoneNo;
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

	@Override
	public String toString() {
		return "Staff [id=" + id + ", name=" + name + ", address=" + address + ", phoneNo=" + phoneNo + "]";
	}

}
