package _031_builder_pattern;

import java.util.*;

public class AnimalBuilder {

	private String species;
	private int age;
	private List<String> favoriteFoods;

	public AnimalBuilder setAge(int age) {
		this.age = age;
		return this;
	}

	public AnimalBuilder setSpecies(String species) {
		this.species = species;
		return this;
	}

	public AnimalBuilder setFavoriteFoods(List<String> favoriteFoods) {
		this.favoriteFoods = favoriteFoods;
		return this;
	}

	public Animal build() {
		return new Animal(species, age, favoriteFoods);
	}
	
	public static void main(String[] args) {
		
		AnimalBuilder duckBuilder = new AnimalBuilder();
		duckBuilder
		 .setAge(4)
		 .setSpecies("duck")
		 .setFavoriteFoods(Arrays.asList("grass","fish"));
		
		Animal duck = duckBuilder.build();
		System.out.println(duck.getAge());
		System.out.println(duck.getSpecies());
		System.out.println(duck.getFavoriteFood(0));
		System.out.println(duck.getFavoriteFood(1));

		System.out.println("-------------------------");

		Animal flamingo = new AnimalBuilder()
				 .setSpecies("flamingo")
				 .setFavoriteFoods(Arrays.asList("algae","insects"))
				 .build();
		System.out.println(flamingo.getAge());
		System.out.println(flamingo.getSpecies());
		System.out.println(flamingo.getFavoriteFood(0));
		System.out.println(flamingo.getFavoriteFood(1));
	

	}
}
