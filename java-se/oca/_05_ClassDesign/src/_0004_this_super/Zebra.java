package _0004_this_super;

public class Zebra extends Animal {
	
	public Zebra(int age) {
		super(age); // calls Animal(int age) and Always on the first line
		System.out.println("Zebra(int age): "+ age);
	}

	public Zebra() {
		this(100); // calls Zebra(int age) and Always on the first line
		System.out.println("Zebra()");
	}
	
	public static void main(String[] args) {
		Zebra obj = new Zebra();
	}
}