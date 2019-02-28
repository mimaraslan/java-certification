package _0010_3_method_overloading;

public class MyOverloadingError {
	
	public static void aMethod(byte val) {
		System.out.println("byte");
	}

	public static void aMethod(short val) {
		System.out.println("short");
	}

	public static void main(String[] args) {
		aMethod((short) 9);
		aMethod((byte) 9);
		aMethod(9); //  is not applicable for the arguments (int)
	}
}