package com.orubele.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanBaseballScope {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		
		//retrieve the spring container bean
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		
		//verify if both bean point to the same memory
		boolean result = (theCoach.equals(alphaCoach));
		
		//print the bean memory location for both
		System.out.println("The objects are pointing to the same reference: "+result);
		System.out.println("Memeory location of the coach: " +theCoach);
		System.out.println("Memory location of the alpha: "+alphaCoach);
		System.out.println(alphaCoach.getDailyWorkout());
		
		//end context
		context.close();
	}
}
