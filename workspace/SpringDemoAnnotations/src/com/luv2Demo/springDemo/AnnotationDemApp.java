package com.luv2Demo.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Coach coach = ctx.getBean("tennisCoach", Coach.class);
		System.out.println(coach.getWorkDetails());
		
		System.out.println(coach.getDailyFortune());
		ctx.close();
	}

}
