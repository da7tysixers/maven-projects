package com.orubele.javadependency;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfigDemo {
	
	@Bean
	public FortuneService crazyFortuneService() {
		return new CrazyFortuneService();
	}
	
	
	@Bean
	public Coach footballCoach() {
		return new FootballCoach(crazyFortuneService());

}

}