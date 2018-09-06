package com.luv2Demo.springDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringJavaConfigDemoApp2 {

	public static void main(String[] args) {
AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);
		System.out.println(coach.getWorkDetails());
		System.out.println(coach.getEmail());
		System.out.println(coach.getTeam());
		System.out.println(coach.getDailyFortune());
		context.close();
	}

}
