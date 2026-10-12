package com.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Student {
	
	@Id
	private int stdId;
	private String name;
	
	@ManyToMany
	private List<Courses >courses;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int stdId, String name, List<Courses> courses) {
		super();
		this.stdId = stdId;
		this.name = name;
		this.courses = courses;
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Courses> getCourses() {
		return courses;
	}

	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", name=" + name + ", courses=" + courses + "]";
	}

	
	
}
