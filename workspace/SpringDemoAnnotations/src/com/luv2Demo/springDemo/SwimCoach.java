package com.luv2Demo.springDemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
		
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getWorkDetails() {
		// TODO Auto-generated method stub
		return "Daily workout";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
