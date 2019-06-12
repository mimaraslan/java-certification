package _0005_this_super;

public class Gorilla extends Animal {
	public Gorilla(int age) {
		super(age, "Gorilla");
		System.out.println("Gorilla(int age): "+ age);

	}

	public Gorilla() {
		super(5);
		System.out.println("Gorilla() ");

	}
	
	public static void main(String[] args) {
		new Gorilla();
		System.out.println("---------------");
		new Gorilla(10);
	}
}