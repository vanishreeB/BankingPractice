package com.luv2code.springDemo;

public class CricketCoach implements Coach {
	private FortuneService FortuneService;
	private String emailAddress;
	private String team;
	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("inside email setter - cricket coach");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("inside team setter - cricket coach");
		this.team = team;
	}

	public CricketCoach() {
	System.out.println("inside coach no-args-constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("inside coach setter method");
		FortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "fast bowling for 15 mins";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return FortuneService.getfortune();
	}

	
}
