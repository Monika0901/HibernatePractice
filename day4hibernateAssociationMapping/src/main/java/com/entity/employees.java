package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class employees {
    @Id
    int empid;
	 String name;
	 String city;
	 
	 @OneToOne()
	 @JoinColumn(name= "pId")
	 Phone phone;

	 public employees() {
		super();
		// TODO Auto-generated constructor stub
	 }

	 public employees(int empid, String name, String city, Phone phone) {
		super();
		this.empid = empid;
		this.name = name;
		this.city = city;
		this.phone = phone;
	 }

	 public int getEmpid() {
		 return empid;
	 }

	 public void setEmpid(int empid) {
		 this.empid = empid;
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

	 public Phone getPhone() {
		 return phone;
	 }

	 public void setPhone(Phone phone) {
		 this.phone = phone;
	 }

	 @Override
	 public String toString() {
		return "employees [empid=" + empid + ", name=" + name + ", city=" + city + ", phone=" + phone + "]";
	 }
	 
	
	 
	 
}
