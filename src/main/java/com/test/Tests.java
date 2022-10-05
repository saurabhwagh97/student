package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.students.Students;

public class Tests {
	public static void main(String[] args) {
		
	
	Students students = new Students(101,"Saurabh","JBK","Nagpur",87);
	
	Configuration cfg = new Configuration();
	cfg.configure().addAnnotatedClass(Students.class);
	
	SessionFactory sessionFactory = cfg.buildSessionFactory();
	Session session = sessionFactory.openSession();
	Transaction transaction = session.beginTransaction();
	
	
	students.setStudentCity("Pune");
	students.setStudentClg("Raisoni");
	students.setStudentName("john");

	session.update(students);
	transaction.commit();
	}
}
