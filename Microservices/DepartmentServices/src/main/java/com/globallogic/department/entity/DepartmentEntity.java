package com.globallogic.department.entity;

import javax.persistence.*;

@Entity
@Table(name = "departmententity")
public class DepartmentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	
	@Column
	String name;
	
	@Column
	String location;

	public DepartmentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DepartmentEntity(long id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "DepartmentEntity [id=" + id + ", name=" + name + ", location=" + location + "]";
	}

	
	
}
