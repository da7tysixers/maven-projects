package com.orubele.springconfig;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemo {
	public static void main(String[] args){
		// read spring config file
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		
		// get the bean from spring container
		CoachTwo theCoachTwo = context.getBean("tennisPlayer", CoachTwo.class);
		
		// print values from the bean class.
		System.out.println(theCoachTwo.getDailyFortune());
		System.out.println(theCoachTwo.getDailyWorkout());
		
		
		// close annotationConfig
		context.close();
		
		

	}
}
