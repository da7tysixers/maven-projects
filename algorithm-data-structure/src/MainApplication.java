
public class MainApplication {
	public static void main(String[] args) {
		
		
		Human tom = new Human();
		tom.setAge(5);
		tom.setEyeColor("brown");
		tom.setHeightInInches(72);
		tom.setName("Tom Zaly");
		tom.speak();
		System.out.println();
		
		Human joe = new Human();
		joe.setName("Joe Rogue");
		joe.setAge(50);
		joe.setEyeColor("blue");
		joe.setHeightInInches(75);
		
		joe.speak();
	}
}
