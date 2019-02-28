package _0010_2_method_overloading;

public class MyOverloaded {
	public static void aMethod(int val) {
		System.out.println("int");
	}

	public static void aMethod(short val) {
		System.out.println("short");
	}

	public static void aMethod(Object val) {
		System.out.println("object");
	}

	public static void aMethod(String val) {
		System.out.println("String");
	}

	public static void main(String[] args) {
		byte b = 9;
		aMethod(b); // short
		aMethod(9); // int
		Integer i = 9;
		aMethod(i); // object
		aMethod("9"); // String
	}
}