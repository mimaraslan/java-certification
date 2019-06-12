package _0036_lambda;

import java.util.ArrayList;
import java.util.List;

public class TraditionalSearch {
	public static void main(String[] args) {
		
		List<Animal> animals = new ArrayList<Animal>(); // list of animals
		
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));

		print(animals, new CheckIfHopper()); // pass class that does check
		print(animals,		 a     	  ->		a.canHop()); //Lambda Syntax
			//	     parameterName   arrow  	body

		System.out.println("-------------------");
		print(animals, new CheckIfSwimmer()); // pass class that does check
		print(animals, a -> a.canSwim());
		print(animals, a -> ! a.canSwim());
		
		System.out.println("-------------------");
		boolean wantWhetherCanHop = true;
		print(animals, a -> a.canHop() == wantWhetherCanHop);
	}

	private static void print(List<Animal> animals, CheckTrait checker) {
		for (Animal animal : animals) {
			if (checker.test(animal)) // the general check
				System.out.print(animal + " ");
		}
		System.out.println();
	}
}