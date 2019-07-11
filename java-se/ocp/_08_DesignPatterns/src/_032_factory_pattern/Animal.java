package _032_factory_pattern;

import java.util.*;

/*
1. Mark all of the instance variables private and final.
2. Use a constructor to set all properties of the object.
3. Do not define any setter methods.
4. Do not allow referenced mutable objects to be modified or accessed directly.
5. Prevent methods from being overridden. 
*/

// class itself is marked final, so the methods cannot be overridden by a subclass
public final class Animal {

	// Mark all of the instance variables private and final
	private final String species;
	private final int age;
	private final List<String> favoriteFoods;

	// Use a constructor to set all properties of the object
	public Animal(String species, int age, List<String> favoriteFoods) {
		this.species = species;
		this.age = age;
		if (favoriteFoods == null) {
			throw new RuntimeException("favoriteFoods is required");
		}
		this.favoriteFoods = new ArrayList<String>(favoriteFoods);
	}

	// Do not define any setter methods.
	public String getSpecies() {
		return species;
	}
	
	// Do not define any setter methods.
	public int getAge() {
		return age;
	}
	
	// Do not define any setter methods.
	public int getFavoriteFoodsCount() {
		return favoriteFoods.size();
	}
	
	// Do not define any setter methods.
	public String getFavoriteFood(int index) {
		return favoriteFoods.get(index);
	}
}