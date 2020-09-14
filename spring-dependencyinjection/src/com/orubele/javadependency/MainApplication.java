package com.orubele.javadependency;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {
	public static void main(String[] args) {
		// get spring configuration
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(JavaConfigDemo.class);
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("footballCoach", Coach.class);
		
		
		// print bean from spring container
		System.out.println("The Coach: " +theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());
		
		
		// close the context.
		context.close();
	}
}
