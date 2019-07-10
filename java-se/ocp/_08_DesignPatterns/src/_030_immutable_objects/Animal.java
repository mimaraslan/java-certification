package _030_immutable_objects;

import java.util.*;

/*
1. Mark all of the instance variables private and final.
2. Use a constructor to set all properties of the object.
3. Do not define any setter methods.
4. Do not allow referenced mutable objects to be modified or accessed directly.
5. Prevent methods from being overridden. 
*/
public final class Animal {
	
	// Mark all of the instance variables private and final
	private final List<String> favoriteFoods;

	// Use a constructor to set all properties of the object
	public Animal(List<String> favoriteFoods) {
		if (favoriteFoods == null) {
			throw new RuntimeException("favoriteFoods is required");
		}
		this.favoriteFoods = new ArrayList<String>(favoriteFoods);
	}

	public List<String> getFavoriteFoods() { // MAKES CLASS MUTABLE!
		return favoriteFoods;
	}
}