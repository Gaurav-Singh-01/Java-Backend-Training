package com.globallogic.demojpaonetoone.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class DepartmentEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String name;
	
	@Column
	private String location;

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

	public DepartmentEntity(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}

	public DepartmentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
