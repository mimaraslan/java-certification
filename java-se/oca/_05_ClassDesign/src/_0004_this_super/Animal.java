package _0004_this_super;

public class Animal extends Object{
	private int age;

	public Animal(int age) {
		super(); // calls Object and Always on the first line
		this.age = age;
		System.out.println("Animal(int age): "+ this.age);
	}
}