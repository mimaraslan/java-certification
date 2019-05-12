package _0010_constructors;

public class Chick {
	public Chick() {
		System.out.println("in constructor");
	}
		
	// return type void !!! NOT A CONSTRUCTOR
	public void Chick() {
		System.out.println("in method");
	} 
	
	public static void main(String[] args) {
		Chick chick = new Chick();
		chick.Chick();
	}
}