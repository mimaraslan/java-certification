package _0034_interface_variables;

public interface CanDig {

	// private or protected will trigger a compiler error.
	private int MAXIMUM_DEPTH = 100; // DOES NOT COMPILE
	protected abstract boolean UNDERWATER = false; // DOES NOT COMPILE

	// automatically insert public static final
	// missing a value
	public static String TYPE; // DOES NOT COMPILE
}