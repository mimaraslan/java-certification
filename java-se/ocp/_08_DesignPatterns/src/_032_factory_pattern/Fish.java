package _032_factory_pattern;

public class Fish extends Food {
	
	// could not mark the constructors private
	public Fish(int quantity) {
		super(quantity);
	}

	public void consumed() {
		System.out.println("Fish eaten: " + getQuantity());
	}
}