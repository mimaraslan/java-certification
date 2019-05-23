package _0005_casting_primitive_values;

public class MainApp {

	public static void main(String[] args) {
		
		int x = (int)1.0;
		short y = (short)1921222; // Stored as 20678
		int z = (int)9l;
		long t = 192301398193810323L;

		System.out.println("x is " + x); 
		System.out.println("y is " + y); 
		System.out.println("z is " + x); 
		System.out.println("t is " + y); 
		System.out.println(2147483647+1); // -2147483648

		
		short a = 10;
		short b = 3;
	 // short c = a * b; // DOES NOT COMPILE
		short c = (short)(a * b);
		System.out.println("c is " + c); 

		
		
	}
}
