package com.luv2Demo.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScope {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Coach coach = context.getBean("tennisCoach", Coach.class );
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class );
		  boolean results = coach == alphaCoach;
		    context.close();
	}

}
