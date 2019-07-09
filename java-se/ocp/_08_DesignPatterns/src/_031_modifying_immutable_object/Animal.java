package _031_modifying_immutable_object;

import java.util.Arrays;
import java.util.List;

public class Animal {
	
	public Animal(String string, int i, List<String> asList) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String firstName = "Grace";
		String fullName = firstName + " Hopper";

		// Create a new Animal instance
		Animal lion = new Animal("lion", 5, Arrays.asList("meat","more meat"));
	}
}