package com.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Courses;
import com.entity.Employee;
import com.entity.Student;

public class manytomany {

	public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        cfg.addAnnotatedClass(Student.class);
        cfg.addAnnotatedClass(Courses.class);

        SessionFactory sf = cfg.buildSessionFactory();
        Session ss = sf.openSession();
        Transaction tr = ss.beginTransaction();
        
        Courses c1 = new Courses();
        c1.setCourseid(101);
        c1.setCoursename("java");
     
        
        Courses c2 = new Courses();
        c2.setCourseid(102);
        c2.setCoursename("python");
        
        
        Courses c3 = new Courses();
        c3.setCourseid(103);
        c3.setCoursename("SQL");
       
        
        List<Courses> list1 = new ArrayList<Courses>();
		list1.add(c1);
		list1.add(c2);
		list1.add(c3);
		
        ss.persist(c1);
        ss.persist(c2);
        ss.persist(c3);
        
        
        Student s = new Student();
        s.setStdId(1);
        s.setName("jiya");
        s.setCourses(list1);
        
        Student s1 = new Student();
        s1.setStdId(2);
        s1.setName("priya");
        s1.setCourses(list1);
        
        
        
        
        List<Student> list11 = new ArrayList<Student>();
		list11.add(s);
		list11.add(s1);
		
		
		c1.setStudent(list11);
		c2.setStudent(list11);
		 c3.setStudent(list11);
        
        ss.persist(s);
        ss.persist(s1);
        
        tr.commit();

        System.out.println("Data inserted successfully!");

        ss.close();
        sf.close();
		
	}
	
	
}
