package com.entity;

import java.util.List;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import jakarta.persistence.OneToMany;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int depid;
	private String depname;
	
	@OneToMany
List<Employee> emp;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int depid, String depname, List<Employee> emp) {
		super();
		this.depid = depid;
		this.depname = depname;
		this.emp = emp;
	}

	public int getDepid() {
		return depid;
	}

	public void setDepid(int depid) {
		this.depid = depid;
	}

	public String getDepname() {
		return depname;
	}

	public void setDepname(String depname) {
		this.depname = depname;
	}

	public List<Employee> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Department [depid=" + depid + ", depname=" + depname + ", emp=" + emp + "]";
	}
	
	
	
	
	

}
