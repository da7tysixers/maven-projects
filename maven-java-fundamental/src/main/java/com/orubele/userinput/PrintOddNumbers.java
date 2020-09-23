package com.orubele.userinput;

public class PrintOddNumbers {
	public static void main(String[] args) {
		
		PrintOddNum();
	}

	private static void PrintOddNum() {
		for (int i = 0; i < 20; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
		
	}
}
