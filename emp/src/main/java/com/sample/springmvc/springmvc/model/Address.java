package com.sample.springmvc.springmvc.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity

@JsonIdentityInfo(generator = ObjectIdGenerators.UUIDGenerator.class, property = "@id")

public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="add_PK")
	private long id;
	private String stName;
	private String city;

	 @ManyToOne(cascade=CascadeType.ALL)
	 @JoinColumn(name="emp_id")
	 private Employee employee;
	 
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", stName=" + stName + ", city=" + city + "]";
	}
	public Address(long id, String stName, String city) {
		super();
		this.id = id;
		this.stName = stName;
		this.city = city;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

  	
}
