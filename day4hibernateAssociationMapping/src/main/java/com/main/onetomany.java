package com.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Department;
import com.entity.Employee;

public class onetomany {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		cfg.addAnnotatedClass(Department.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Department d = new Department();
		d.setDepname("sales");

		Employee e1 = new Employee();
		e1.setEmpid(101);
		e1.setName("mona");
		e1.setCity("nsk");
		e1.setAge(22);
		e1.setDept(d);
		
		
		Employee e2 = new Employee();
		e2.setEmpid(102);
		e2.setName("sona");
		e2.setCity("pune");
		e2.setAge(20);
		e2.setDept(d);
		
		Employee e3 = new Employee();
		e3.setEmpid(103);
		e3.setName("samu");
		e3.setCity("latur");
		e3.setAge(20);
		e3.setDept(d);


		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);

		d.setEmp(list);

		ss.persist(d);
		ss.persist(e1);
		ss.persist(e2);
		ss.persist(e3);

		System.out.println("Inserted ...!");

		tr.commit();
		ss.close();
	}
}

