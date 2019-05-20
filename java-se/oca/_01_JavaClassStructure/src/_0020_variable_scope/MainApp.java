package _0020_variable_scope;

public class MainApp {

	public void eat(int piecesOfCheese) {
		int bitesOfCheese = 1;
	}

	public void eatIfHungry(boolean hungry) {
		if (hungry) {
			int bitesOfCheese = 1;
		} // bitesOfCheese goes out of scope here
		System.out.println(bitesOfCheese);// DOES NOT COMPILE
	}

	public void eatIfHungry2(boolean hungry) {
		if (hungry) {
			int bitesOfCheese = 1;
			{
				boolean teenyBit = true; // scope until the block ends
				System.out.println(bitesOfCheese);
			}
		}
		System.out.println(teenyBit); // DOES NOT COMPILE
	}

	
	public void eatMore(boolean hungry, int amountOfFood) {
		int roomInBelly = 5;
		if (hungry) {
			boolean timeToEat = true;
			while (amountOfFood > 0) {
				int amountEaten = 2;
				roomInBelly = roomInBelly - amountEaten;
				amountOfFood = amountOfFood - amountEaten;
			}
		}
		System.out.println(amountOfFood);
	}
	
	public static void main(String[] args) {

	}
}