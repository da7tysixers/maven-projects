package com.orubele.springannotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve a bean from the spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		// check if both are equal.
		boolean ifEqual = (alphaCoach == theCoach);
		
		// print result to console.
		System.out.println("\nPointing to the same object:" +ifEqual);
		
		System.out.println("\nMemory location for theCoach:" +theCoach);
		System.out.println("\nMemory location for alphaCoach:" +alphaCoach);
		
		//close application context
		context.close();
	}
	
}
