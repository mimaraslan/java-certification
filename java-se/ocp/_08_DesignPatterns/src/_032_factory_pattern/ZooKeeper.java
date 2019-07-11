package _032_factory_pattern;

public class ZooKeeper {
	
	public static void main(String[] args) {
		final Food food = FoodFactory.getFood("polar bear"); // zebra, rabbit, goat
		food.consumed();
	}
}