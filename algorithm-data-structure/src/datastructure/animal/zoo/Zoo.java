package datastructure.animal.zoo;

public class Zoo {
	public static void main(String[] args) {
		Animal animal = new Animal(22, "Female", 170);
		
		animal.eat();
		
		Bird bird1 = new Bird();
		bird1.fly();
		Fish fish = new Fish();
	}
}
