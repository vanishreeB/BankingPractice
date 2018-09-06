package com.lov2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.lov2code.hibernate.entity.Student;


public class ReadStudentDemo2 {

	public static void main(String[] args) {

		
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();

		Session session = factory.getCurrentSession();
		
		try{
			System.out.println("creating new object");
			
			Student student = new Student("madhu", "MT", "madhu@gmail.com");
			//student.setId(8);
			session.beginTransaction();
			System.out.println("saving");
			session.save(student);
			
			session.getTransaction().commit();
			System.out.println(" saved");
			
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			System.out.println("retrive");
			Student myStudent = session.get(Student.class, student.getId());
			System.out.println(myStudent);
			session.getTransaction().commit();
			System.out.println(" Done");
			
		}
		finally{
			factory.close();
		}
	}

}
