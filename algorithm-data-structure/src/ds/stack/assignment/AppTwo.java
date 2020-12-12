package ds.stack.assignment;

import java.util.Arrays;
import java.util.Iterator;

public class AppTwo {
	public static void main(String[] args) {
		StackTwo theStack = new StackTwo(10);
		
		System.out.println(reverseString("HELLO"));
		System.out.println(reverseString("Hello",theStack));
	}
	
	public static String reverseString(String str, StackTwo theStack) {
		char[] reverseWord = str.toCharArray();
		for (char c : reverseWord) {
			theStack.push(c);
		}
		int i = 0;
		while (!theStack.isEmpty()) {
			reverseWord[i] = theStack.pop();
			i++;
		}
		
		String result = Arrays.toString(reverseWord);
		
		return result;
	}
	
	public static String reverseString(String str) {
		String result = "";
		int length = str.length();
		StackTwo myStack = new StackTwo(length);
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			myStack.push(c);
		}
		
		while (!myStack.isEmpty()) {
			result += myStack.pop();
		}
		return result;
	}
	
	
	
	
	
}
