package adt;

public class Counter {
	private String name;
	private int counter;
	
	public Counter(String str) {
		this.name = str;
		this.counter = 0;
	}
	
	public void increment() {
		this.counter++;
	
	}
	public int getCurrentValue() {
		return this.counter;
	}
	
	public String toString() {
		return name + ": " + counter;
	}
}
