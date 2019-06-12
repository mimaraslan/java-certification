package _0001_extending_class;

public class Lion extends Animal {
	private void roar() {
		System.out.println("The " + getAge() + " year old lion says: Roar!");		
	//	System.out.println("The " +   age    + " year old lion says: Roar!"); // DOES NOT COMPILE
	}
}