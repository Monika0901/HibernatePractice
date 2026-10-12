package com.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.POJO.Student;

public class StudenDao {

	public void saveStudent(Student std) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Student s = new Student();
		s.setId(std.getId());
		s.setName(std.getName());
		s.setCity(std.getCity());
		s.setAge(std.getAge());

		ss.persist(s);
		tr.commit();
		ss.close();
		sf.close();

		System.out.println("Inserted...");
	}

	public void deleteStudent(Student std) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Student s = ss.get(Student.class, std.getId());
		ss.remove(s);

		tr.commit();
		ss.close();
		sf.close();

		System.out.println("deleted");
	}

	public void updateStudent(Student std) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		ss.merge(std);

		tr.commit();
		ss.close();
		sf.close();

		System.out.println("Updated...");
	}

	public void showstudent(Student std) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Student s = ss.get(Student.class, std.getId());
		System.out.println("Student ID: " + s.getId());
		System.out.println("Student Name: " + s.getName());
		System.out.println("Student city: " + s.getCity());
		System.out.println("Student age: " + s.getAge());

		ss.close();
		sf.close();
	}
}