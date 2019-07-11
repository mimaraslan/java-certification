package _032_factory_pattern;

public abstract class Food {
	
	private int quantity;

	public Food(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public abstract void consumed();
}