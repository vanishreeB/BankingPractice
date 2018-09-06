package com.luv2Demo.springDemo;

import org.springframework.stereotype.Component;

@Component
public class DataBaseFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "inside DataBaseFortuneService";
	}

}
