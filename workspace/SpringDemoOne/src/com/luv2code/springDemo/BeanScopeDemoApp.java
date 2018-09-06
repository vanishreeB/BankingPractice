package com.luv2code.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanScopeApplicationContext.xml");
    
    Coach coach = context.getBean("myCoach", Coach.class);
    Coach alphaAoach = context.getBean("myCoach", Coach.class);
    boolean results = coach == alphaAoach;
    System.out.println(results);
    System.out.println(coach);
    System.out.println(alphaAoach);
    context.close();
	}

}
