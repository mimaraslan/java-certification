package _0005_this_super;

public class Animal extends Object {
	
	private int age;
	private String name;

	public Animal(int age) {
		super();
		this.age = age;
		this.name = null;
		System.out.println("Animal(int age): "+ this.age + " - " + this.name);
	}
	
	public Animal(int age, String name) {
		super();
		this.age = age;
		this.name = name;
		System.out.println("Animal(int age, String name): "+ this.age + " - " + this.name);
	}
}