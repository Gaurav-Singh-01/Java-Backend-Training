package com.globallogic.spring_core;

import java.util.List;
import java.util.Set;

public class Employee {
	
	private int id;
	private String name;
	private List<String> address;
	private Set<String> phone;
	
	
	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	public Set<String> getPhone() {
		return phone;
	}

	public void setPhone(Set<String> phone) {
		this.phone = phone;
	}

	public Employee(int id, String name, List<String> address, Set<String> phone) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
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

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	

}
