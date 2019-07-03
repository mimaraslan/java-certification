package _0019_CallingMethodsThrowExceptions;

class NoMoreCarrotsException extends Exception {
	public NoMoreCarrotsException() {
		System.out.println("NoMoreCarrotsException");
	}
}

public class Bunny {

	private static void eatCarrot() throws NoMoreCarrotsException {
		System.out.println("eatCarrot");
	}

	// 1. Status
	public static void main(String[] args) {
		eatCarrot();// DOES NOT COMPILE
	}

	// 2. Status
	public static void main(String[] args) throws NoMoreCarrotsException {// declare exception
		eatCarrot();
	}

	// 3. Status
	public static void main(String[] args) {
		try {
			eatCarrot();
		} catch (NoMoreCarrotsException e) {// handle exception
			System.out.print("sad rabbit");
		}
	}
	
}