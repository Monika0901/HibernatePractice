package com.Dao;

import java.util.List;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.POJO.Students;

public class StudentDao {
	
	//insert data
	public void insertData(Students std) {
	Configuration cfg = new Configuration();
	              cfg.configure();
	              cfg.addAnnotatedClass(Students.class);
	 SessionFactory sf=  cfg.buildSessionFactory() ; 
	 Session ss= sf.openSession();
	 Transaction tr = ss.beginTransaction();
	 
	    Students s = new Students();
	    s.setId(std.getId());
	    s.setName(std.getName());
	    s.setAge(std.getAge());
	    s.setCity(std.getCity());
	    
	    ss.persist(s);
	    tr.commit();
	    
	}

	//updateData
	public void updateData(Students std) {
	Configuration cfg = new Configuration();
	              cfg.configure();
	              cfg.addAnnotatedClass(Students.class);
	 SessionFactory sf=  cfg.buildSessionFactory() ; 
	 Session ss= sf.openSession();
	 Transaction tr = ss.beginTransaction();
	 
	 String hqlQuery = "update Students set name=:name , city=:city  where id =: id";
		MutationQuery query = ss.createMutationQuery(hqlQuery);
		
	    query.setParameter("id", std.getId());
	    query.setParameter("name", std.getName());
	    query.setParameter("city", std.getCity());
		query.executeUpdate();

		System.out.println("Updated ...!");

		tr.commit();
		ss.close();
	}
	
	//delete 
	public void deleteData(Students std) {

	
			Configuration cfg = new Configuration();
			cfg.configure();
			cfg.addAnnotatedClass(Students.class);

			SessionFactory sf = cfg.buildSessionFactory();
			Session ss = sf.openSession();
			Transaction tr = ss.beginTransaction();

			String hqlQuery = "delete from Students where id =: id";
			MutationQuery query = ss.createMutationQuery(hqlQuery);
			query.setParameter("id", std.getId());
			query.executeUpdate();

			System.out.println("deleted ...!");

			tr.commit();
			ss.close();
		}
	
	
	//GetSingleResult
	public void GetSingleResult(Students std) {

		
			Configuration cfg = new Configuration();
			cfg.configure();
			cfg.addAnnotatedClass(Students.class);

			SessionFactory sf = cfg.buildSessionFactory();
			Session ss = sf.openSession();
			Transaction tr = ss.beginTransaction();

			String hqlQuery = "from Students where id =: id";

			Query<Students> query = ss.createQuery(hqlQuery, Students.class);
			query.setParameter("id", std.getId());

			Students st = query.getSingleResult();

			System.out.println(st);

			tr.commit();
			ss.close();
			
	}
	
	//FetchAllData
	public void FetchAllData (Students std ) {

			Configuration cfg = new Configuration();
			cfg.configure();
			cfg.addAnnotatedClass(Students.class);

			SessionFactory sf = cfg.buildSessionFactory();
			Session ss = sf.openSession();
			Transaction tr = ss.beginTransaction();

			String hqlQuery = "from Students";

			org.hibernate.query.Query<Students> query = ss.createQuery(hqlQuery, Students.class);
			List<Students> list = query.list();
//			jakarta.persistence.Query query = ss.createQuery(hqlQuery);
//			query.getResultList();
//			query.g
//			List<Student> list = query.getResultList();

			System.out.println(list);
}
}
