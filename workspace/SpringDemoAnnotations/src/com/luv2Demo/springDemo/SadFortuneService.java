package com.luv2Demo.springDemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Today is not sad day";
	}

}
