package com.orubele.spring;

public class MyApp {
	public static void main(String[] args) {
		// Create an object
		Coach baseballCoach = new BasketballCoach();
		
		// Use the object.
		System.out.println(baseballCoach.getDailyWorkout());
	}
}
