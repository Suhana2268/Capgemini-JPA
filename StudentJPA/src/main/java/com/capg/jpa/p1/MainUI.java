package com.capg.jpa.p1;
import java.sql.SQLException;

import javax.persistence.Query;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class MainUI {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory(); 
		
		System.out.println("1");
		
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		Student st = new Student();
		st.setStuId(1);
		st.setStudentName("Sam");
		st.setAge(23);
		st.setMarks(100);
		
		
		Student st1 = new Student();
		st1.setStuId(2);
		st1.setStudentName("Suhana");
		st1.setAge(23);
		st1.setMarks(100);
		
		Student st2 = new Student();
		st2.setStuId(3);
		st2.setStudentName("xyz");
		st2.setAge(23);
		st2.setMarks(100);
		
		Student st3 = new Student();
		st3.setStuId(4);
		st3.setStudentName("abc");
		st3.setAge(23);
		st3.setMarks(100);
		
		session.save(st); 
		session.save(st1);
		session.save(st2);
		session.save(st3);
		
	
		/**Student s = new Student();
		s = (Student)session.load(Student.class, 2);
		s.setMarks(300);
		session.saveOrUpdate(s);
		
		System.out.println(s);
		
		s = (Student)session.load(Student.class, 3);
		session.delete(s);
		
		System.out.println(s);**/
		
		
		
		/**Certificates certificate = new Certificates("Java", "LB Institute");
		Student st0 = new Student(25, "Maya", 200, 23, certificate);
		
		session.save(st0);**/
		
		
		System.out.println("  -->> Data Saved ..");
		
		
		t.commit();

		
	}

}
