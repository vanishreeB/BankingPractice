package com.luv2Demo.springDemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {		
		return "Today you are lucky";
	}

}
