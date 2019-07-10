package _031_modifying_immutable_object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Animal {
	
	// Create a new Animal instance using data from the first instance
	List<String> favoriteFoods = new ArrayList<String>();
	for(int i=0; i<lion.getFavoriteFoodsCount(); i++) {
	 favoriteFoods.add(lion.getFavoriteFood(i));
	}
	
	Animal updatedLion = new Animal(lion.getSpecies(), lion.getAge()+1, favoriteFoods);

	public static void main(String[] args) {
		String firstName = "Grace";
		String fullName = firstName + " Hopper";

		// Create a new Animal instance
		Animal lion = new Animal("lion", 5, Arrays.asList("meat","more meat"));
	}
}