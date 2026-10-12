package Com.tka;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.spi.SessionFactoryBuilderService;
import org.hibernate.cfg.Configuration;

public class StudentMain {
  public static void main(String args[]) {
	  
	  Configuration cfg = new Configuration();
	  cfg.configure();
	  cfg.addAnnotatedClass(Student.class);
	  
	SessionFactory sf=  cfg.buildSessionFactory();
	Session ss = sf.openSession();
	   Transaction  tr = ss.beginTransaction();
	
	   Student s = new Student();
	   s.setId(2);
	   s.setName("monika");
	   s.setCity("pune");
	   s.setAge(22);
	   
	   ss.persist(s);
	   tr.commit();
	   ss.close();
	   System.out.println("inserted");
  }
}
