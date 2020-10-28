package datastructure.animal;

public class Bird extends Fly implements Animal {
	private int age;
	private String name;
	
	

	public Bird(int age, String name) {
		super();
		System.out.println("<<<Inside of constructor>>>");
		this.age = age;
		this.name = name;
	}

	@Override
	public void age() {
		System.out.printf("Hello I am a bird my name is %s ", this.name);
		System.out.printf("%nI am %d years old", this.age);

	}

	@Override
	public void eat() {
		System.out.println("I eat other birds like pidgeons");

	}

	@Override
	public void sound() {
		System.out.println("\nBird sound wac wac wac, I am an " + this.name);

	}

	@Override
	public String flying() {
		// TODO Auto-generated method stub
		return "I can fly 20 thousand feet high.";
	}

}
