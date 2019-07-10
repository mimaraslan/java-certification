package _031_modifying_immutable_object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
1. Mark all of the instance variables private and final.
2. Use a constructor to set all properties of the object.
3. Do not define any setter methods.
4. Do not allow referenced mutable objects to be modified or accessed directly.
5. Prevent methods from being overridden. 
*/
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