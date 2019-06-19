package _0046_polymorphism_and_method_overriding;

public class ZooKeeper {
	public static void main(String[] args) {
		Animal animal = new Gorilla();
		System.out.println(animal.getName());
	}
}