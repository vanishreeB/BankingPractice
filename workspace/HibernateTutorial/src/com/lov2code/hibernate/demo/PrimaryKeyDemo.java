package com.lov2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.lov2code.hibernate.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {

		
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();

		Session session = factory.getCurrentSession();
		
		try{
			System.out.println("creating new object");
			Student student = new Student("vani", "shree", "vanishree@gmail.com");
			Student student1 = new Student("shree", "vani", "vanishree1456@gmail.com");
			Student student2 = new Student("vani", "vani", "vani@gmail.com");
			Student student3 = new Student("shree", "shree", "vaniplgdg789@gmail.com");
			//student.setId(8);
			session.beginTransaction();
			System.out.println("saving");
			session.save(student);
			session.save(student1);
			session.save(student2);
			session.save(student3);
			session.getTransaction().commit();
			System.out.println("done");
			
		}
		finally{
			factory.close();
		}

	}

}
