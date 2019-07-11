package _032_factory_pattern;

public class Pellets extends Food {
	
	public Pellets(int quantity) {
		super(quantity);
	}

	public void consumed() {
		System.out.println("Pellets eaten: " + getQuantity());
	}
}