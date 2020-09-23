package com.orubele.userinput;

public class MethodWithReturn {
	public static void main(String[] args) {
		int x = 22;
		int y = 40;
				
		System.out.printf("The sum of x and y is = %s ", add(x, y));
	}

	private static int add(int x, int y) {
		return x + y;
		
	}
}
