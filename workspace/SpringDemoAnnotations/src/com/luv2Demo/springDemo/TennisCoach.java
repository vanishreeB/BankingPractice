package com.luv2Demo.springDemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("No -arg Constructor - TennisCoach");
	}
	@PostConstruct
	public void initMethod(){
		System.out.println("initial method");
	}
	@PreDestroy
public void destroymethod(){
	System.out.println("destroy method");
	}	
	/*@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	/*@Autowired
	public void setDoCrazy(FortuneService fortuneService) {
		System.out.println("Inside crazy method- TennisCoach");
		this.fortuneService = fortuneService;
	}
*/	@Override
	public String getWorkDetails() {
		return "Practice tennis everyday";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
