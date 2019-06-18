package _0032_same_name_methods_multiple_inheritance;

public class Bear implements Herbivore, Omnivore {

	public int eatPlants() { // DOES NOT COMPILE
		System.out.println("Eating plants: 10");
		return 10;
	}

	public void eatPlants() { // DOES NOT COMPILE
		System.out.println("Eating plants");
	}

	public static void main(String[] args) {
		Bear bear = new Bear();
		bear.eatPlants();
	}
}