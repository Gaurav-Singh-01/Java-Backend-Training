package com.globallogic.demojpaonetoone.model;

public class EmployeeModel {
	
	long id;
	
	String name;
	
	String job;

	public EmployeeModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeModel(long id, String name, String job) {
		super();
		this.id = id;
		this.name = name;
		this.job = job;
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

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "EmployeeModel [id=" + id + ", name=" + name + ", job=" + job + "]";
	}
	
	

}
