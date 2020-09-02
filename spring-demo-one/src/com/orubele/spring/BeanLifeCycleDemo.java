package com.orubele.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemo {
	public static void main(String[] args) {
		//Load Spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		// Retrieve bean from spring container.
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		
		//print the coach file
		System.out.println(theCoach.getDailyWorkout());
		
		//close the context
		context.close();
	}
}
