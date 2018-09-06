package com.luv2code.springDemo;

public class BaseballCoach implements Coach{
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout(){
		return "Spnd 30 minutes";
	}

	@Override
	public String getDailyFortune() {
	return fortuneService.getfortune();
	}
}
