package com.luv2Demo.springDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.luv2Demo.springDemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {

	@Bean
	public FortuneService sadFortuneService(){
		return new SadFortuneService();
		
	}
	
	@Bean
	public Coach swimCoach(){
		return new SwimCoach(sadFortuneService());
		
	}
}
