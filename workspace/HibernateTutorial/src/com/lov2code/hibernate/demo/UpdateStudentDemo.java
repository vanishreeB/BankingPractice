package com.lov2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.lov2code.hibernate.entity.Student;


public class UpdateStudentDemo {

	public static void main(String[] args) {

		
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();

		Session session = factory.getCurrentSession();
		
		try{
			
			session.beginTransaction();
			
			Student myStudent = session.get(Student.class, 1);
			myStudent.setFirstName("sccoby");
			session.createQuery("update Student set email= 'foo.gamil.com'").executeUpdate();
			session.getTransaction().commit();
			System.out.println("done");
				
			
		}
		finally{
			factory.close();
		}
	}

}
