package com.globallogic.jpagenerationtype.entity;

import javax.persistence.*;

@Entity
@Table(name="employeeDemo")
public class EmployeeDemo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	
	@Column(name="sname")
	String sname;
	
	@Column(name="ssalary")
	double ssalary;

	public EmployeeDemo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeDemo(long id, String sname, double ssalary) {
		super();
		this.id = id;
		this.sname = sname;
		this.ssalary = ssalary;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public double getSsalary() {
		return ssalary;
	}

	public void setSsalary(double ssalary) {
		this.ssalary = ssalary;
	}

	@Override
	public String toString() {
		return "EmployeeDemo [id=" + id + ", sname=" + sname + ", ssalary=" + ssalary + "]";
	}
	
	

}
