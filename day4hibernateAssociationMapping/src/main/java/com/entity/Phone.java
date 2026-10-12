package com.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Phone {
  @Id
  int phId;
@Column(name = "phone_Name", nullable = false, unique = true, length = 100)
 String name;


public Phone() {
	super();
	// TODO Auto-generated constructor stub
}


public Phone(int phId, String name) {
	super();
	this.phId = phId;
	this.name = name;
}


public int getPhId() {
	return phId;
}


public void setPhId(int phId) {
	this.phId = phId;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


@Override
public String toString() {
	return "Phone [phId=" + phId + ", name=" + name + "]";
}



}
