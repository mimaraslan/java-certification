package _019_encapsulating_data;

public class Animal {
	public String species;
	public int age;
	
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.age = -100;
		System.out.println(animal.age);
	}
}