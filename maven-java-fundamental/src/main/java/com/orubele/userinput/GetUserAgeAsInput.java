package com.orubele.userinput;

import java.util.Scanner;

public class GetUserAgeAsInput {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter your name: ");
		String name = scan.nextLine();
		System.out.println("Enter your age");
		String age = scan.nextLine();
		int userAge = Integer.parseInt(age);
		System.out.printf("Welcome %s You your age is %s", name, userAge);
		
	}
}
