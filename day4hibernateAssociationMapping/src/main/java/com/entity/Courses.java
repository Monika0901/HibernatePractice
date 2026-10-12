package com.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Courses {

	@Id
    private int courseid;
    private String coursename;
    

	@ManyToMany
	private List<Student >Student;
    
	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Courses(int courseid, String coursename) {
		super();
		this.courseid = courseid;
		this.coursename = coursename;
	}


	public Courses(int courseid, String coursename, List<com.entity.Student> student) {
		super();
		this.courseid = courseid;
		this.coursename = coursename;
		Student = student;
	}


	public int getCourseid() {
		return courseid;
	}


	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}


	public String getCoursename() {
		return coursename;
	}


	public List<Student> getStudent() {
		return Student;
	}


	public void setStudent(List<Student> student) {
		Student = student;
	}


	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}


	@Override
	public String toString() {
		return "Courses [courseid=" + courseid + ", coursename=" + coursename + ", Student=" + Student + "]";
	}
	
	
    
    
}
