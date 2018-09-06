package com.luv2code.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new  ClassPathXmlApplicationContext("ApplicationContext.xml");
		CricketCoach coach = context.getBean("cricketCoach", CricketCoach.class);
		CricketCoach coach1 = context.getBean("cricketCoach", CricketCoach.class);
		
			
		
		
	}

}
