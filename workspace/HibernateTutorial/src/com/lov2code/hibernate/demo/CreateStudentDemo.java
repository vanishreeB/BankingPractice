package com.lov2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.lov2code.hibernate.entity.Student;


public class CreateStudentDemo {

	public static void main(String[] args) {

		
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();

		Session session = factory.getCurrentSession();
		
		try{
			System.out.println("creating new object");
			
			Student student = new Student("vani", "shree", "vanishree@gmail.com");
			
			session.beginTransaction();
			System.out.println("saving");
			session.save(student);
			session.getTransaction().commit();
			System.out.println("done");
		}
		finally{
			factory.close();
		}
	}

}
