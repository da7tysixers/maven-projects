package com.orubele.userinput;

public class PrintNegativeNumbers {
	public static void main(String[] args) {
		negativeNumber();
	}

	public static void negativeNumber() {
		System.out.println("Inside Method");
		//int x = 10;
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
		
	}

}
