package _0012_overriding_accessible;

public class Snake extends Reptile {
	
	protected boolean hasLegs() {
		return false;
	}

	protected double getWeight() throws InsufficientDataException {
		return 2;
	}
	
	public static void main(String[] args) throws InsufficientDataException {
		Snake snake = new Snake();
		snake.getWeight();
	}
}
