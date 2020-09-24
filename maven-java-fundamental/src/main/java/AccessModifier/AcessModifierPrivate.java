package AccessModifier;

public class AcessModifierPrivate {
	public static void main(String[] args) {
		
		int x = 0;
		Modifier modify = new Modifier(x);
		Modifier moby = new Modifier(x);
		
		System.out.println(modify.equals(moby));
		
	
		
	}
}



class Modifier{
	private int number;
	
	public Modifier(int number) {
		this.number = number;
	}
	
	public boolean equals(Object other) {
		if (other instanceof Modifier) {
			Modifier mod = (Modifier) other;
			
			if (this.number == mod.number) {
				return true;
			}
		}
		return false;
	}
	
	
}
