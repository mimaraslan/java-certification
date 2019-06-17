package _0012_overriding_accessible;

public class Reptile {

	protected boolean hasLegs() throws InsufficientDataException {
		throw new InsufficientDataException();
	}

	protected double getWeight() throws Exception {
		return 2;
	}

	protected double getHeight() throws InsufficientDataException {
		return 2;
	}

	protected int getLength() {
		return 10;
	}
}