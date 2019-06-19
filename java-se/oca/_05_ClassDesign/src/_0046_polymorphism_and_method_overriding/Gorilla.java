package _0046_polymorphism_and_method_overriding;

public class Gorilla extends Animal {
	 protected String getName() { // DOES NOT COMPILE
		 return "Gorilla";
	}
}