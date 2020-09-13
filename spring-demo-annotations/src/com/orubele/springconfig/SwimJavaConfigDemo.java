package com.orubele.springconfig;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemo {
	public static void main(String[] args){
		// read spring config file
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		
		// get the bean from spring container
		SwimCoach theCoachTwo = context.getBean("swimCoach", SwimCoach.class);
		
		// print values from the bean class.
		System.out.println(theCoachTwo.getDailyFortune());
		System.out.println(theCoachTwo.getDailyWorkout());
		
		// print team and email.
		System.out.println("Email: "+theCoachTwo.getEmail());
		System.out.println("Team: "+theCoachTwo.getTeam());
	
		
		// close annotationConfig
		context.close();
		
		

	}
}
