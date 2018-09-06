package com.luv2code.springDemo;

public class TrackCoach implements Coach {
    private FortuneService FortuneService;
    
    
	public TrackCoach(FortuneService fortuneService) {
		FortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run 5km";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "just do it" + FortuneService.getfortune();
	}
	
	
	public void initMethod(){
		System.out.println("initial method");
	}
public void destroymethod(){
	System.out.println("destroy method");
	}

}
