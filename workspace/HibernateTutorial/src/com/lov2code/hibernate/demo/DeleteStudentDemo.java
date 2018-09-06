package com.lov2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.lov2code.hibernate.entity.Student;


public class DeleteStudentDemo {

	public static void main(String[] args) {

		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
								.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try{			
			session.beginTransaction();
			
			Student myStudent = session.get(Student.class, 2);
			
			session.delete(myStudent);
			
			session.createQuery("Delete from Student where firstName='vani'").executeUpdate();
			
			session.getTransaction().commit();
			System.out.println("done");
			
			
		}
		finally{
			factory.close();
		}
	}

}
