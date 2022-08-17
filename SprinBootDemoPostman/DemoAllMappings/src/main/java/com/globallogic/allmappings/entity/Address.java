package com.globallogic.allmappings.entity;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	
	@Column
	String city;
	
	@Column
	double pincode;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(long id, String city, double pincode) {
		super();
		this.id = id;
		this.city = city;
		this.pincode = pincode;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getPincode() {
		return pincode;
	}

	public void setPincode(double pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	

}
