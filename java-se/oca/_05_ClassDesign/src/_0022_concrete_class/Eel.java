package _0022_concrete_class;

public abstract class Eel {
	public static void main(String[] args) {
		// Abstract classes cannot be instantiated directly.
		final Eel eel = new Eel(); // DOES NOT COMPILE
	}
}