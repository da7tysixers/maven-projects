package adt;

public class App {
	public static void main(String[] args) {
		Counter myCount = new Counter("myCounter");
		
		myCount.increment();
		myCount.increment();
		myCount.increment();
		myCount.increment();
		
		System.out.println(myCount.getCurrentValue());
	}
}
