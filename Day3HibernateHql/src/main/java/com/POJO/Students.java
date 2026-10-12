package com.POJO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Students {
    
	@Id
	private int id;
	private String name;
	@Column(name="address")
	private String city;
	private int age;
	
	
	
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Students(int id, String name, String city, int age) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.age = age;
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


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", city=" + city + ", age=" + age + "]";
	}
	
	
}
