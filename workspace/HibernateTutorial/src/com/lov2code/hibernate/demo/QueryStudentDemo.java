package com.lov2code.hibernate.demo;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.lov2code.hibernate.entity.Student;




public class QueryStudentDemo {

	public static void main(String[] args) {

		
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();

		Session session = factory.getCurrentSession();
		
		try{
			session.beginTransaction();
			List<Student> theStudents = session.createQuery("from Student").list();	
			displayStudents(theStudents);
			
		/*	theStudents = session.createQuery("from Student where lastName = 'mt'").list();
			displayStudents(theStudents);
						
			theStudents = session.createQuery("from Student where lastName = 'mt' or firstName='vani'").list();
			displayStudents(theStudents);*/
			
			theStudents = session.createQuery("from Student where email like 'vani.com'").list();
			displayStudents(theStudents);
			
			session.getTransaction().commit();
			System.out.println("done");
		}
		finally{
			factory.close();
		}
	}

	private static void displayStudents(List<Student> theStudents) {
		for (Student  st : theStudents){
			System.out.println(st);
		}
	}

}
