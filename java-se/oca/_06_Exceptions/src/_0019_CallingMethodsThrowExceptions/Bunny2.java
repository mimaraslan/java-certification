package _0019_CallingMethodsThrowExceptions;

class NoMoreCarrotsException extends Exception {
	public NoMoreCarrotsException() {
		System.out.println("NoMoreCarrotsException");
	}
}

public class Bunny2 {

	private static void eatCarrot() {
		System.out.println("eatCarrot\n\n");
	}

	public void bad() {
		try {
			System.out.println("bad");
			eatCarrot();
		} catch (NoMoreCarrotsException e) {// DOES NOT COMPILE
			System.out.print("sad rabbit");
		}
	}

	public void good() throws NoMoreCarrotsException {
		System.out.println("good");
		eatCarrot();
	}

	public static void main(String[] args) {
		Bunny2 obj = new Bunny2();
		
		obj.bad();
		
		try {
			obj.good();
		} catch (NoMoreCarrotsException e) {
			e.printStackTrace();
		}
		
		eatCarrot();
	}

}