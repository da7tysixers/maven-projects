package com.orubele.springconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.orubele.springconfig")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	
	// define bean for our sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	// define bean for our swim coach AND inject dependency
	@Bean
	public CoachTwo swimCoach() {
		return new SwimCoach(sadFortuneService());
	}

}
