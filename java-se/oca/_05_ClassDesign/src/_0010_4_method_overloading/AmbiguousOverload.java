package _0010_4_method_overloading;

public class AmbiguousOverload {
	
	public static void aMethod(long val1, int val2) {
		System.out.println("long, int");
	}

	public static void aMethod(int val1, long val2) {
		System.out.println("int, long");
	}

	public static void main(String[] args) {

		aMethod(9L, 10);
		
		aMethod((long)9, 10);

		aMethod(9, 10L);

		aMethod(9, (long)10);

		aMethod(9, 10); // is ambiguous for the type
		
		aMethod(9L, 10L); //  is not applicable for the arguments
	}
}