package com.luv2Demo.springDemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	
	
	private String[] data={
			"vani"," shree","daddy"
	};
	
	private Random random= new Random();
	@Override
	public String getFortune() {
		int index = random.nextInt(data.length);
		String theFortune = data[index];
		return theFortune;
	}

}
