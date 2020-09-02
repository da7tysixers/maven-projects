package com.orubele.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
	public static void main(String[] args) {
		//Load Spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		// Retrieve bean from spring container.
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//Check if they are the same
		boolean result = theCoach == alphaCoach;
		
		//print out the results
		System.out.println("\npointing to the same result: " + result);
		
		// print memeory locations for both coach.
		System.out.println("\nMemory location for theCoach: " + theCoach);
		System.out.println("\nMemeory location for alphaCoach: " + alphaCoach);
		
		//close the context
		context.close();
	}
}
