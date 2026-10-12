package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Phone;
import com.entity.employees;

public class onetoone {


		public static void main(String[] args) {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(employees.class);
			cfg.addAnnotatedClass(Phone.class);

			SessionFactory sf = cfg.buildSessionFactory();
			Session ss = sf.openSession();
			Transaction tr = ss.beginTransaction();

			Phone p = new Phone();
			p.setPhId(101);
			p.setName("vivo");

			employees em = new employees();
			em.setEmpid(201);
			em.setName("jiya");
			em.setCity("Latur");
			em.setPhone(p);

			ss.persist(p);
     		ss.persist(em);

			System.out.println("Inserted ...!");

			tr.commit();
			ss.close();
		}
	}

