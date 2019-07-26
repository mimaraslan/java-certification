package _012_interacting_legacy_code;

public class LegacyAutoboxing {

	public static void main(String[] args) {

		java.util.List numbers = new java.util.ArrayList();
		numbers.add(5);

		int result = numbers.get(0); // DOES NOT COMPILE
		// Java doesn’t know that the list contains an Integer
		// Type mismatch: cannot convert from Object to int
		// Object can not be unboxed into an int.
		System.out.println(result);

		int result2 = (int) numbers.get(0);
		System.out.println(result2);
	}
}