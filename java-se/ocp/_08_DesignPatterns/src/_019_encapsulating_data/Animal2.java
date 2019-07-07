package _019_encapsulating_data;

public class Animal2 {
	private String species;
	private int age;

	public Animal2(String species) {
		this.setSpecies(species);
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		if (species == null || species.trim().length() == 0) {
			throw new IllegalArgumentException("Species is required");
		}
		this.species = species;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0) {
			throw new IllegalArgumentException("Age cannot be a negative number");
		}
		this.age = age;
	}


	public static void main(String[] args) {
		Animal2 animal = new Animal2("Cat");
		animal.setAge(2);
		System.out.println(animal.getSpecies() + " " + animal.getAge());
	}
}