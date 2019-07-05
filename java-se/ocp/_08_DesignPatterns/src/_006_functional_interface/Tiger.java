package _006_functional_interface;

public class Tiger implements Sprint {
	
	public void sprint(Animal animal) {
		System.out.println("Animal is sprinting fast! " + animal.toString());
	}
	
	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		Animal animal = new Animal();
		tiger.sprint(animal);
	}
}