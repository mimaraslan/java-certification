package _0031_abstract_methods_multiple_inheritance;

public class Bear implements Herbivore, Omnivore {
	
	public void eatMeat() {
		System.out.println("Eating meat");
	}

	public void eatPlants() {
		System.out.println("Eating plants");
	}

	public int eatPlants(int quantity) {
		System.out.println("Eating plants: "+quantity);
		return quantity;
	}
	
	public static void main(String[] args) {
		Bear bear = new Bear();
		bear.eatMeat();   // Eating meat
		bear.eatPlants(); // Eating plants
		bear.eatPlants(10); // Eating plants: 10

	}
}